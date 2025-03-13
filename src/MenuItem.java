public class MenuItem {

    private String name;
    private double price;
    private String explanation;

    public MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getExplanation() {
        return this.explanation;
    }

    @Override
    public String toString() {
        return String.format("%s | W %.1f | %s", this.name, this.price, this.explanation);
    }     // 문자열을 추가하기 위해서는 %s , doubled을 사용하려했지만 오류가남. 1f는 소숫점 1자리까지 표기

}














