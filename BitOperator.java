public class BitOperator {
    public static void main(String[] args) {
        short a = (short) 0x55ff;
        short b = (short) 0x00ff;

        // 비트 논리 연산
        System.out.println("[비트 연산 결과]");
        System.out.printf("%04x\n", (short) (a & b)); // 비트 AND, printf("%x\n",...)은 결과 값을 16진수 형식으로 출력.
        System.out.printf("%04x\n", (short) (a | b));
        System.out.printf("%04x\n", (short) (a ^ b));
        System.out.printf("%04x\n", (short) (~a));

        byte c = 20;
        byte d = -8;

        System.out.println("[시프트 연산 결과]");
        System.out.println(c << 2); // c를 2비트 왼쪽 시프트.
        System.out.println(c >> 2); // c를 2비트 오른쪽 시프트, 0을 삽입.
        System.out.println(d >> 2); // c를 2비트 오른쪽 시프트, 1을 삽입.
        System.out.printf("%x\n", (d >>> 2)); // d를 2비트 오른쪽 시프트, 0을 삽입.
    }
}