public class Main {
    public static void main(String[] args) {

        int len = 150;
        int wid = 200;
        int side = 100;
        Rectangle land1 = new Rectangle(len, wid);

        Rectangle land2 = new Rectangle(side);

        Rectangle land3 = new Rectangle(0);

        land1.setWidth(125);
        land2.setWidth(125);
        land3.setWidth(125);

        //perimeters


        int perimeter1 = land1.getLength() + land1.getLength() + land1.getWidth()+ land1.getWidth();
        int perimeter2 = land2.getLength() + land2.getLength() + land2.getWidth()+ land2.getWidth();
        int perimeter3 = land3.getLength() + land3.getLength() + land3.getWidth()+ land3.getWidth();

        int perimeterSum = perimeter1 + perimeter2 + perimeter3;

        System.out.println(perimeterSum);

    }
}