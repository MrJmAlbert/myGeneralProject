package com.myproject.iam.controller.v1.admin;

import java.io.*;
import java.util.ArrayList;

public class DataProcessing {

    /**
     * 把文件按行读取成数组
     * @param name
     * @return
     */

    private static String[] toArrayByInputStreamReader(String name) {
        // 使用ArrayList来存储每行读取到的字符串
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(name);
            InputStreamReader inputReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bf = new BufferedReader(inputReader);
            // 按行读取字符串
            String str;
            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            inputReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对ArrayList中存储的字符串进行处理
        int length = arrayList.size();
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            String s = arrayList.get(i);
            //array[i] = Integer.parseInt(s);
            array[i] = s;
        }
        // 返回数组
        return array;
    }


    private static void toFileByArray(String name, String[] array) {
        try {
            File file = new File(name);
            OutputStreamWriter outputWriter = new OutputStreamWriter(new FileOutputStream(file));
            BufferedWriter bw = new BufferedWriter(outputWriter);


            for(int i=0;i<array.length;i++){
                String rowStr = array[i];
                //bw.write("select '"+ rowStr +"' as table_name,count(*) as row_num from "+rowStr+" union all \r\n");
                // AVG(`te_lg00011`) as  ,
                // teLg00011
//                String field = rowStr.substring(rowStr.indexOf("`")+1,rowStr.lastIndexOf('`'))
//                        .replace("_","")
//                        .replace("l","L");
//                bw.write(rowStr.replace(",","")+" as "+field+",\r\n");

                String[] arr = rowStr.split("\t");

                // id
                String id = getString(arr,0);
                //CodeManageServiceImpl c = new CodeManageServiceImpl();

                //String code = codeManageService.getCode(CodeFunctionModuleEnum.BUSINESS_INFO_CODE);

//                bw.write(
//                        "UPDATE `g-server`.`b_business_info`" +
//                                "SET (`"+code + "')"+
//                                "WHERE"+ "id=" + id +
//                                "\r\n");
            }
            bw.close();
            outputWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getString(String[] arr,int index){
        if(arr.length>index){
            return arr[index];
        }
        return "";
    }


    public static void main(String[] args) {


        String filePath = "C:\\Users\\zhe.liu\\Desktop\\g-prod-business-info.csv";

        String fileOutPath = "C:\\Users\\zhe.liu\\Desktop\\rows.txt";

        String[] array = toArrayByInputStreamReader(filePath);


        toFileByArray(fileOutPath, array);
    }
}
