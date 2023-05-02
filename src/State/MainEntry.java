package State;

import State.impl.Player;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner( System.in );

        while( true ){
            System.out.println(
                "플레이어의 상태: " + player.getState().getDescription()
                + " / 속도 : " + player.getSpeed() + "km/h"
            );

            System.out.println( "[1]제자리 서기 [2]앉기 [3]걷기 [4]뛰기 [5]종료: " );

            String input = scanner.next();
            System.out.println();

            /** 들어온 입력값에 따라 상태 처리 */

            if ( input.equals( "1" ) ){
                player.getState().standUp();
            }
            else if ( input.equals( "2" ) ){
                player.getState().sitDown();
            }
            else if ( input.equals( "3" ) ){
                player.getState().walk();
            }
            else if ( input.equals( "4" ) ){
                player.getState().run();
            }
            else if ( input.equals( "5" ) ){
                break;
            }

        }
        /** 프로그람이 종료될때 scanner 객체 닫음 */
        scanner.close();
    }

}
