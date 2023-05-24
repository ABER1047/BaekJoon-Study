package Q;
import com.sun.source.util.SourcePositions;
import org.w3c.dom.Text;

import java.sql.SQLOutput;
import java.util.*;
public class Q_10798 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[][] Text = new char[5][15];
        String str;
        int max = 0;
        for(int i = 0 ; i < Text.length ; i++){
            str = sc.nextLine();
            if(max <= str.length()){
                max = str.length();
            }
            for(int j = 0 ; j < str.length() ; j++){
                Text[i][j] = str.charAt(j);


            }

        }

        for(int j = 0 ; j < max ; j++){

            for(int i = 0 ; i < Text.length ; i++){
                if(Text[i][j] == '\0'){
                    continue;
                }
                System.out.print(Text[i][j]);
            }
        }

    }
}
