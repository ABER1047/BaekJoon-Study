from sys import stdin


class JavaVersusCpp:
    def __init__(self):
        self.input_string = stdin.readline().rstrip("\n")

    def ConvertString(self):
        # 모두 사용가능한 형태의 문자열의 경우 변환과정이 필요 없으므로 그대로 출력한다.
        if self.isAllAvailable():
            print(self.input_string)

        else:
            # 변환된 문자열이 저장될 변수
            converted_string = ""

            # 입력 문자열이 Java의 문자열인 경우 C의 문자열로 변환한다.
            if self.isJavaLang():
                for str_char in self.input_string:
                    if not str_char.isupper():
                        converted_string += str_char
                    else:
                        converted_string += f"_{str_char.lower()}"

            # 입력 문자열이 C의 문자열인 경우 Java의 문자열로 변환한다.
            elif self.isCLang():
                splited_str_list = self.input_string.split("_")
                converted_string = splited_str_list[0]

                for splited_str in splited_str_list[1:]:
                    converted_string += splited_str[0].upper() + splited_str[1:]

            # 둘다 아닐 경우 'Error!'을 출력한다.
            else:
                converted_string = "Error!"

            print(converted_string)

    def isAllAvailable(self) -> bool:
        return self.isJavaLang() and self.isCLang()

    def isJavaLang(self) -> bool:
        check: bool = True

        if "_" in self.input_string:
            check = False

        if self.isError():
           check = False

        return check

    def isCLang(self) -> bool:
        check: bool = True

        for str_char in self.input_string:
            if str_char.isupper():
                check = False
                break

        if self.isError():
            check = False

        return check

    def isError(self):
        check: bool = False

        if self.input_string[0] == "_" or self.input_string[-1] == "_":
            check = True

        if self.input_string[0].isupper():
            check = True

        if "__" in self.input_string:
            check = True

        return check


if __name__ == '__main__':
    JVC = JavaVersusCpp()
    JVC.ConvertString()
