public class Task3 {
    public static void main(String[] args){
        int randomNum;
        randomNum = (int)(Math.random()*102);
        System.out.println("Згенероване число=" + randomNum);
        System.out.println("Кількість цифр=" + Integer.toString(randomNum).length());

    }
}
