package models;

public class Bubble {
    private short[] data = new short[10];
    public void setData(short[] array) {
        for (short i=0;i<array.length;i++)
            data[i] = array[i];
    }
    public short[] getData() {
        return data;
    }
    public void ordenar() {
        for (short i=1;i<data.length;i++)
            for (short j=0;j< data.length-i;j++)
                if (data[j]>data[j+1])
                    intercambiar(j,(short)(j+1));
    }
    public void intercambiar(short i, short j) {
        short aux;
        aux = data[i];
        data[i] = data[j];
        data[j] = aux;
    }
}
