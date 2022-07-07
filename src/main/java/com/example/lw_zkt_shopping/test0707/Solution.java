package com.example.lw_zkt_shopping.test0707;

import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 单词替换问题  648. 单词替换
/** 总结
 * @date 20220707
 *
 */

public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        // 向上转型
         Set objects = new HashSet<String>();
         // 使用 for -each 循环
        for(String aa : dictionary){
            objects.add(aa);
        }

        String[] words = sentence.split(" ");
        for (int j = 0 ; j < words.length ; j++){
            // 不用 for-each 方便赋值
            String word = words[j];
            for (int i = 0; i < word.length(); i++) {
                if(objects.contains(word.substring(0,1+i))){
                    words[j] = word.substring(0,1+i);
                    break;
                }
            }

        }
        // 用“ ” 连接数组
        return String.join(" " , words);
    }

    public static void main(String[] args) {

        // 初始构造list对象    正常用add 增加
        List<String> dictionary = Lists.newArrayList("a" , "b" , "v");
        String sentence = "aadsfasf absbs bbab cadsfafs";
        Solution solution = new Solution();
        System.out.println(solution.replaceWords(dictionary,sentence));
    }


}