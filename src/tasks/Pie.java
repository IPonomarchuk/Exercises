package tasks;

public class Pie {

    /*Есть пирог и 100 гостей. Первый гость берет 1% от пирога. Второй 2% от оставшегося, 3 берет 3% и так далее.
    Какой гость возьмет самый большой кусок пирога. Прогу надо написать так, чтобы она разобрала пирог на 100 частей,
    нашла самый большой и какому гостю он достанется и потом собрать обратно ради проверки.*/

    public static void biggestPieceOfPie() {

        int guests = 100;
        double pie = 100.00;
        double biggestPiece = 0.00;
        int guest = 0;
        double fullPie = 0.00;

        for (int i = 1; i < guests + 1; i++) {

            double pieceOfPie = (pie / 100) * i;
            System.out.println(pieceOfPie);
            fullPie = fullPie + pieceOfPie;
            pie = pie - pieceOfPie;

            System.out.println(pie);

            if (pieceOfPie > biggestPiece) {
                biggestPiece = pieceOfPie;
                guest = i;
            }
        }
        System.out.println(biggestPiece);
        System.out.println(guest);
        System.out.println(fullPie);
    }
}
