package loopshw;

import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean arrived = true;
        boolean notArrived = true;

        while(notArrived){
            System.out.println("Are We There Yet?");
            Boolean bn = Boolean.parseBoolean(sc.nextLine());

            if(arrived){
                System.out.println(("Yes!!"));
                arrived = false;
            }else if(notArrived){
                System.out.println(("No!!"));
                notArrived = true;
            }
        }
            }
        }
