package feature_30_1_26;

public class CompareStringBufferAndBuilder {

    public static void main(String[] args) {

        String str= "hello";
        int iteration= 1_000_000;

        StringBuilder builder= new StringBuilder();
        StringBuffer buffer= new StringBuffer();

        long timeStart= System.nanoTime();

        for(int i=0;i<iteration;i++){
            buffer.append(str);
        }

        long timeEnd= System.nanoTime();

        System.out.println("Time taken by StringBuffer: "+(timeEnd-timeStart));

        timeStart= System.nanoTime();

        for(int i=0;i<iteration;i++){
            builder.append(str);
        }
        timeEnd= System.nanoTime();
        System.out.println("Time taken by StringBuilder: "+(timeEnd-timeStart));
    }
}
