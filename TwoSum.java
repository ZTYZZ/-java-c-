/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/
//此题首先想到的是暴力搜索，虽然暴力，复杂度也很高，但是。。。简单啊
//所以我立刻就用了这个方法实现成功了。。。。。
//代码如下
//另一种在下面。。


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        for(int i = 0 ;i < nums.length ;i++) {
            for(int j = i+1;j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    num[0] = i;
                    num[1] = j;
                    break;
                }
                
                
            }
          
        }
    return num;
        
    }
}

//第二种，就是继续改进，上面的代码



class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0 ;i < nums.length ;i++) {
            for(int j = i+1;j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};//不用新建一个数组 ，节省空间
                }
                
                
            }
          
        }
    throw new IllegalArgumentException("no such two nums");//在没有找到，就抛出一个错误。
        
    }
}



//第三种方法，用HashMap，因为从集合中找值，Hash Table 能够很好的进行查找，而且给定键来找值，几乎是线性时间的。
//因为要想更加快速的找到元素所在的位置，就必须将键设为值，值设为键。所以导入hashmap里的时候，要反着导，，，这就避免了for循环查找的繁琐
//因为一定会有两个操作。1.找到两个元素，2、通过元素查找位置。
//有一个疑问，如果输入是3 3 2    6 这样的 为什么能成功呢？？ hashmap是键值唯一的啊。。。插不进去。。
//懂了 能插进去  而且相同的元素 会替换掉。。因为键是相同的 所以值每次都取最大的。。。
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        //利用一个循环将元素导入
        for(int i = 0;i<nums.length;i++) {
            m.put(nums[i],i);//小套路！！！！！
        }
        
        for(int j = 0;j<nums.length;j++) {
            if(m.containsKey(target - nums[j]) && m.get(target - nums[j]) != j) {//map只有包含containsKey或者containsValue的这两个方法。没有contains()方法。另外 get方法只能查找值。
                return new int[] {j ,m.get(target - nums[j])};
                
            }
        }
        throw new IllegalArgumentException("no such argument");
        
    }
}

//第四种方法。更加简便。
//想一下，我又没有可能在一个循环中做完呢？？

//那必须得遍查边导。
//这个想法是先找到最后一个元素。
//然后根据最后一个元素和HashMap 配对。不会出现同一个元素相加的情况，因为hashMap里面永远都是比他少一个元素。
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
            for(int i = 0;i<nums.length;i++) {
                int f = target - nums[i];
                
                if(m.containsKey(f)  ) {//
                    return new int[] {m.get(f),i};
                }
                m.put(nums[i],i);
                
            }
        
    throw new IllegalArgumentException("no such argument");
        
    }
}

