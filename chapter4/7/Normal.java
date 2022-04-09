import java.util.LinkedList;
import java.util.List;

public class Normal {

    // A -> 0 (index)
    // B -> 1 (index)
    // the num of cars moved from A to B is represented in the range 0~5
    // the num of cars moved from B to A is represented in the range -5~0

    int[] numOfCars = {0,0};

    // ロケーションAに置かれる車の数と，ろけーしょんBにおけるそれ．
    int rangeOfFirstLoc = 10;
    int rangeOfSecondLoc = 10;

    // v(s) ある状態sにおける価値
    int[][] valueFunc = new int[rangeOfFirstLoc][rangeOfSecondLoc];
    // π(s) ある状態sにおける次の行動
    int[][] policy = new int[rangeOfFirstLoc][rangeOfSecondLoc];


    // 

    boolean isPolicyStable;


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
