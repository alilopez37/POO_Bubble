import models.Bubble;

public class main {
    public static void main(String[] args) {
        short[] array = {36,125,37,1,47,98,56,85,256,369};
        short[] aux;
        Bubble bubble = new Bubble();
        bubble.setData(array);
        bubble.ordenar();
        aux = bubble.getData();
        for (short i=0;i<aux.length;i++)
            System.out.println(aux[i]);

    }
}
