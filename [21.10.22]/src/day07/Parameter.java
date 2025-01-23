package day07;

public class Parameter {//

    //랜덤으로 음식하나를 골라서 리턴하는 메서드
    static String chooseRandomFood() {
        String[] foods = {"볶음밥", "치킨", "목살", "파스타"};
        int rn = (int)(Math.random() * foods.length);
        return foods[rn];
    }

    //2개의 정수의 합
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    //n개의 정수의 합
   static int add(int... nums) {
        int total = 0;
        for(int n: nums) {
            total += n;
        }
        return total;
    }

    public static void main(String... args) {//
        
        String food = chooseRandomFood();
        System.out.println("food = " + food);

        add(10, (int)20.5);
        int result = add(5, 10, 15, 20, 100 ,200 ,150);
        ////new int[] {}묶어도 풀어도 괜찮음
        System.out.println("result = " + result);

        /* (int... nums)  (String... args)
        varargs 또는 가변인자라고 하며 OrderItem이 0개부터 여러개 까지 매개변수로 올수있는걸 뜻한다.
        여러개의 매개변수를 받아서 사용할떄는 for문을 사용하고 항상 배열로 매개변수를 담지 않아도 된다.
        대신 항상 마지막에만 쓸수있다.
        */


        
    }//
}//
