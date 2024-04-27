public class Test {


    public static void main(String[] args) {
        //modify to foreach loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
        //regex to validate email
        String email = "partha.rath@gmail.com";
        String regex = "^(.+)@(.+)$";
        System.out.println(email.matches(regex));
    }
}
