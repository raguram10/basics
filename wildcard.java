public class wildcard {
    public boolean method(String str,String patter) throws Exception {

        boolean[][] dp = new boolean[patter.length() + 1][str.length()+1];
        dp[0][0]=true;
        for(int i=1;i<str.length()+1;i++)
        {
            dp[0][i]=false;
        }
        for(int i=1;i<patter.length()+1;i++)
        {
            if(patter.charAt(i-1)=='*')
                dp[i][0]=dp[i-1][0];
            else
                dp[i][0]=false;
        }

        for(int i=1;i<patter.length()+1;i++)
        {

            for(int j=1;j<str.length()+1;j++)
            {
                if(str.charAt(j-1)==patter.charAt(i-1)||patter.charAt(i-1)=='?')
                    dp[i][j]=dp[i-1][j-1];
                else if(patter.charAt(i-1)=='*')
                    dp[i][j]=dp[i][j-1]||dp[i-1][j];
                else
                    dp[i][j]=false;
            }
        }


        return dp[patter.length()][str.length()];

    }
}

