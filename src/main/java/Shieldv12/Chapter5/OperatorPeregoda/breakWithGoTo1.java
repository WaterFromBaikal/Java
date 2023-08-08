package Shieldv12.Chapter5.OperatorPeregoda;

/**
 * Операторами перехода можно выходить из циклов
 * Их 3 (не считая try catch..)
 * break; - закрывает только тот цикл, где был вызван;
 * continue; - цикл не закрывает, но пропускает указанное значение
 * return; - прекращает все вложенные циклы, возвращая значение вызывающему методу
 * break с метками; - вложенные циклы можно обозначить через name: ,тогда через break name можно закрыть не текущий уровень вложенности, а любой. ВАЖНО, чтобы эта вложенность была
 */
public class breakWithGoTo1 {
    public static void main(String[] args) {
        first:for(int i = 0; i < 5;i++){
            second: for(int k = 0; k < 5;k++){
                third: for(int j = 0; j < 5;j++){
                    if(j==2){
                        break second;
                    }
                    System.out.print("i:"+i+" k:"+ k + " j:" + j);}
                System.out.println();
            }
            System.out.println();
        }
    }
}
