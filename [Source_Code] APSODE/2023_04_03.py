"""
BaekJoon 27930번 문제
당신은 운명을 믿나요?
2023 고려대학교x연세대학교 프로그래밍 경시대회 Open Contest

문제 풀이
"""


class AreYouTrustDestiny:
    def __init__(self):
        self._destiny_string_part_list = list(input())
        self._korea_univ = ["K", "O", "R", "E", "A"]
        self._yonsei_univ = ["Y", "O", "N", "S", "E", "I"]
        self._korea_check_count = 0
        self._yonsei_check_count = 0
        self.DestinyResult()

    def _check_destiny(self) -> str:
        for destiny_part in self._destiny_string_part_list:
            if self._yonsei_check_count == 6:
                return "YONSEI"

            elif self._korea_check_count == 5:
                return "KOREA"

            self._yonsei_check_count += 1 if destiny_part == self._yonsei_univ[self._yonsei_check_count] else 0
            self._korea_check_count += 1 if destiny_part == self._korea_univ[self._korea_check_count] else 0

    def DestinyResult(self):
        destiny_result = self._check_destiny()
        if destiny_result is not None:
            print(destiny_result)


if __name__ == '__main__':
    AYTD = AreYouTrustDestiny()
