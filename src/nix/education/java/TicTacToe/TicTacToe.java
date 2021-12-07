package nix.education.java.TicTacToe;


import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
        play();
    }
    static void play(){
        playingfield();
    }
    static void playingfield(){
        String[][] field = new String[5][5];
        for(int i = 0;i<5;i++){
            for (int j = 0;j<5;j++){
                field[i][j] = "_";
            }
        }
        tictactoe(field);
    }
    static void tictactoe(String[][] field){
        Scanner scanner = new Scanner(System.in);
        HashSet<String> repit = new HashSet<String>();
        String[] xo = {"X"};
        for (int g = 0;g <= 8;){
            System.out.print("Enter the coordinates: ");
            final String intLine = scanner.nextLine();
            if(repit.contains(intLine)){
                System.out.println("This cell is occupied! Choose another one!");
            }else {
                repit.add(intLine);
                final String[] splitIntLine = intLine.split(" ");
                final int[] coordinates = new int[splitIntLine.length];
                try{
                    for (int i = 0; i < splitIntLine.length; i++) {
                        coordinates[i] = Integer.parseInt(splitIntLine[i]);
                    }
                }catch (NumberFormatException n){
                    System.out.println("You should enter numbers!");
                    continue;
                }
                if(coordinates[0] < 1 || coordinates[1] < 1){
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                if(coordinates[0] > 3 || coordinates[1] > 3){
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                replacechar(xo,field,coordinates);
                replacefield(field);
                System.out.println();
                checkwin(field);
                g++;
                if(g == 9){
                    System.out.println("Impossible");
                }
            }
        }
    }
    static void checkwin(String[][] field){
        if(Objects.equals(field[1][1], field[1][2]) && Objects.equals(field[1][2], field[1][3]) &&
                !Objects.equals(field[1][1], "_") && !Objects.equals(field[1][2], "_") && !Objects.equals(field[1][3], "_") ){
                System.out.println(field[1][1]+" winner");
                System.exit(0);
            }
        if(Objects.equals(field[2][1], field[2][2]) && Objects.equals(field[2][2], field[2][3]) &&
                !Objects.equals(field[2][1], "_") && !Objects.equals(field[2][2], "_") && !Objects.equals(field[2][3], "_") ){
                System.out.println(field[2][1]+" winner");
                System.exit(0);
            }
        if(Objects.equals(field[3][1], field[3][2]) && Objects.equals(field[3][2], field[3][3]) &&
                !Objects.equals(field[3][1], "_") && !Objects.equals(field[3][2], "_") && !Objects.equals(field[3][3], "_") ){
                System.out.println(field[3][1]+" winner");
                System.exit(0);
            }
        if(Objects.equals(field[1][1], field[2][1]) && Objects.equals(field[2][1], field[3][1]) &&
                !Objects.equals(field[1][1], "_") && !Objects.equals(field[2][1], "_") && !Objects.equals(field[3][1], "_") ){
                System.out.println(field[1][1]+" winner");
                System.exit(0);
            }
        if(Objects.equals(field[1][2], field[2][2]) && Objects.equals(field[2][2], field[3][2]) &&
                !Objects.equals(field[1][2], "_") && !Objects.equals(field[2][2], "_") && !Objects.equals(field[3][2], "_") ){
                System.out.println(field[1][2]+" winner");
                System.exit(0);
            }
        if(Objects.equals(field[1][3], field[2][3]) && Objects.equals(field[2][3], field[3][3]) &&
                !Objects.equals(field[1][3], "_") && !Objects.equals(field[2][3], "_") && !Objects.equals(field[3][3], "_") ){
                System.out.println(field[1][3]+" winner");
                System.exit(0);
            }
        if(Objects.equals(field[1][1], field[2][2]) && Objects.equals(field[2][2], field[3][3]) &&
                !Objects.equals(field[1][1], "_") && !Objects.equals(field[2][2], "_") && !Objects.equals(field[3][3], "_") ){
                System.out.println(field[1][1]+" winner");
                System.exit(0);
            }
        if(Objects.equals(field[1][3], field[2][2]) && Objects.equals(field[2][2], field[3][1]) &&
                !Objects.equals(field[1][3], "_") && !Objects.equals(field[2][2], "_") && !Objects.equals(field[3][1], "_") ){
                System.out.println(field[1][3]+" winner");
                System.exit(0);
        }
    }
    static void replacefield(String[][] field){
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                field[i][0] = "|";
                field[i][4] = "|";
                field[0][j] = "-";
                field[4][j] = "-";
                System.out.print(field[i][j] + " ");
            }
        }
    }
    static void replacechar(String[] xo,String[][] field,int[] coordinates){
        field[coordinates[0]][coordinates[1]] = xo[0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(Objects.equals(xo[0],"O")){
                    xo[0] = "X";
                }else {
                    xo[0] = "O";
                }
            }
        }
    }
}
