package CG_Engineers.DSA;

public class Ques4 {

    public static void main(String[] args) {

        String[] subjects= {"Buy now buy","Limited time Offer", "Free mei lelo"};
        String[] spamWords= {"buy","offer","free"};

        for(int i=0;i<subjects.length;i++){
            int count=0;
            for(String s: subjects[i].split(" ")){
                for(int j=0;j<spamWords.length;j++){
                    if(s.toLowerCase().equals(spamWords[j].toLowerCase())){
                        count++;
                    }
                }
            }
            if(count>=2) System.out.println("spam");
            else System.out.println("not spam");
        }
    }
}
