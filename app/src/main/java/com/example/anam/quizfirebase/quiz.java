package com.example.anam.quizfirebase;

public class quiz {
    private String quiz[]=
            {
                    "question one?",
                    "question two?"
            };
    private String opt[][]=
            {
                    {"opt1","opt2","opt3","opt4"},
                    {"opt1","opt2","opt3","opt4"}
            };
    private String rightans[]={"opt1","opt2"};

   public String getquiz(int a){
       String gquiz= quiz[a];
       return gquiz;

   }
    public String getopt1(int a){
        String gopt1= opt[a][0];
        return gopt1;

    }
    public String getopt2(int a){
        String gopt2= opt[a][1];
        return gopt2;

    }
    public String getopt3(int a){
        String gopt3= opt[a][2];
        return gopt3;

    }
    public String getopt4(int a){
        String gopt4= opt[a][3];
        return gopt4;

    }


    public String getcorrectans(int a){
       String ans= rightans[a];
       return ans;
    }
}
