public class boj11720 {

    public static void addStreamNum(String num){
        long result = Stream.of(num.split(""))
            .mapToLong(Long::parseLong) // long 타입으로 parse
            .sum(); // 다 더해주기

        System.out.print(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자 갯수, 숫자 입력 받기
        int N = sc.nextInt();
        String numbers = sc.next();

        // 숫자들 입력 받아서 합 구하기
        addStreamNum(numbers);
    }
}
