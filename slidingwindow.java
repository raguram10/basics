import java.util.*;

public class slidingwindow {
    public List<Integer> slid(int[] nums,int k)
    {
        Map<Integer,Integer>gh=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        Deque<Integer> temp=new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            while(!temp.isEmpty()&&nums[temp.getLast()]<=nums[i])
                temp.removeLast();
            while(!temp.isEmpty()&&temp.getFirst()<=i-k)
                temp.removeFirst();
            temp.addLast(i);
            if(i>=k-1)
                result.add(nums[temp.getFirst()]);

        }
        System.out.println(result);
        return result;
    }
}
