import java.util.LinkedList;
import java.util.List;

public class Normal {

    // A -> 0 (index)
    // B -> 1 (index)
    // the num of cars moved from A to B is represented in the range 0~5
    // the num of cars moved from B to A is represented in the range -5~0

    // int[] numOfCars = {0,0};

    // ロケーションAに置かれる車の最大数と，ろけーしょんBにおけるそれ．
    int maxNumOfCarsInFirstPlace = 10;
    int maxNumOfCarsInSecondPlace = 10;

    // v(s) ある状態sにおける価値
    int[][] valueFunc = new int[maxNumOfCarsInFirstPlace][maxNumOfCarsInSecondPlace];
    // π(s) ある状態sにおける次の行動
    int[][] policy = new int[maxNumOfCarsInFirstPlace][maxNumOfCarsInSecondPlace];


    // 

    boolean isPolicyStable;

    // policy evaluationに使うもの．
    double delta;
    double theta;


    // initialization
    void init(){

    }

    void start() {
        evalPolicy();
        isPolicyStable = improvePolicy();
        if(isPolicyStable) {
            // 方策がstableなら今の価値関数と方策を最適なものとして，終わる．

        }
    }

    // Policy Evaluation
    private void evalPolicy() {
        // 直前の価値関数一時退避先
        double v;
        do {
            delta = 0;
            for (int i = 0; i < maxNumOfCarsInFirstPlace; i++) {
                for (int j = 0; j < maxNumOfCarsInSecondPlace; j++) {
                    v = valueFunc[i][j];
                    valueFunc[i][j] = 
                }
            }
        } while (!(delta < theta));
    }

    private double calcValue(int numOfCarsInFirst, int numOfCarsInSecond) {
        double value = 0.;
        for (int i = 0; i < maxNumOfCarsInFirstPlace; i++) {
            for (int j = 0; j < maxNumOfCarsInSecondPlace; j++) {
                
            }
        }
        return value;
    }

    // 毎回計算しているね
    private double getTransitionProb(int prevNumOfCarsInFirst, int prevNumOfCarsInSecond, int nextNumOfCarsInFirst, int nextNumOfCarsInSecond, int action) {
        int expectedNumOfCarsInFirst = prevNumOfCarsInFirst;
        int expectedNumOfCarsInSecond = prevNumOfCarsInSecond;
        if(0 < action) {
            // first -> second への移動
            if(prevNumOfCarsInFirst < action) {
                // 移動させる量が現在所有している車の量よりも多かった場合．
                expectedNumOfCarsInFirst = 0;
                expectedNumOfCarsInSecond += prevNumOfCarsInFirst;
            } else {
                expectedNumOfCarsInFirst -= action;
                expectedNumOfCarsInSecond += action;
            }
        } else {
            // second -> first への移動
            action = -action;
            if(prevNumOfCarsInSecond < action) {
                // 移動させる量が現在所有している車の量よりも多かった場合．
                expectedNumOfCarsInSecond = 0;
                expectedNumOfCarsInFirst += prevNumOfCarsInSecond;
            } else {
                expectedNumOfCarsInSecond -= action;
                expectedNumOfCarsInFirst += action;
            }
        }

        if((expectedNumOfCarsInFirst == nextNumOfCarsInFirst) && (expectedNumOfCarsInSecond == nextNumOfCarsInSecond)) {
            // 期待される次状態と，渡された次状態が同じ場合
            return 1;
        } else {
            return 0;
        }
    }

    // Policy Improvement
    private boolean improvePolicy() {
        boolean isPolicyStable = true;
        

        return isPolicyStable;
    }


    void printValueFunc() {
        System.out.println("current value func is...");
        // value func表示
    }

    void printCurrentPolicy() {
        System.out.println("current policy is...");
        // policy 表示
    }



    public static void main(String[] args) {
        

        Normal normal = new Normal();
        normal.init();
        normal.start();

        normal.printValueFunc();
        normal.printCurrentPolicy();
    }
}
