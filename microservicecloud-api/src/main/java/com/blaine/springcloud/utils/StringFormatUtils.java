package com.blaine.springcloud.utils;

public class StringFormatUtils {
    public static void main(String[] args) {
        //将要添加的GAV坐标复制过来
        String pomInfo = "private static final String REST_URL_PREFIX = \"http://localhost:8001\";\n" +
                "    \n" +
                "    @Autowired\n" +
                "    private RestTemplate restTemplate;\n" +
                "    \n" +
                "    @RequestMapping(value=\"/consumer/dept/add\")\n" +
                "    public boolean add(Dept dept)\n" +
                "    {\n" +
                "         return restTemplate.postForObject(REST_URL_PREFIX+\"/dept/add\", dept, Boolean.class);\n" +
                "    }\n" +
                "    \n" +
                "    @RequestMapping(value=\"/consumer/dept/get/{id}\")\n" +
                "    public Dept get(@PathVariable(\"id\") Long id)\n" +
                "    {\n" +
                "         return restTemplate.getForObject(REST_URL_PREFIX+\"/dept/get/\"+id, Dept.class);\n" +
                "    }\n" +
                "    \n" +
                "    @SuppressWarnings(\"unchecked\")\n" +
                "    @RequestMapping(value=\"/consumer/dept/list\")\n" +
                "    public List<Dept> list()\n" +
                "    {\n" +
                "         return restTemplate.getForObject(REST_URL_PREFIX+\"/dept/list\", List.class);\n" +
                "    }   ";
        //PS：查看字符串的Unicode编码值方法：
//        System.out.println(Integer.toHexString(" ".charAt(0)));//普通空格，\u0020
//        System.out.println(Integer.toHexString(" ".charAt(0)));//不间断空格，\u00a0

        pomFormat(pomInfo);
    }

    /**
     * 格式化字符串，去掉所有的空格符、换行符
     */
    public static String pomFormat(String pomInfo) {
//        pomInfo = pomInfo.replace("\n", "");//去掉换行符
        pomInfo = pomInfo.replace("\u3000", " ");//去掉普通空格，\u0020
//        pomInfo = pomInfo.replace(" ", "");//去掉普通空格，\u0020
        pomInfo = pomInfo.replace("\u00A0", " ");//去掉不间断空格，\u00a0
//      pomInfo=pomInfo.replace(" ","");//去掉不间断空格，\u00a0
        System.out.println(pomInfo);
        return pomInfo;
    }
}
