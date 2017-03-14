package codility.exams;
public class Problem3 {

    public String solution(String s) {
        String[] ruleArr = {"AB-AA", "BA-AA", "CB-CC", "BC-CC", "AA-A", "CC-C"};
        boolean hasFoundFinal = false;
        for (int i=0;;i++) {
            boolean hasFound = false;
            if (i < ruleArr.length) {
                String[] rule = ruleArr[i].split("-");
                String key = rule[0];
                String replacement = rule[1];
                
                hasFound = s.indexOf(key) > -1;
                hasFoundFinal |= hasFound;
                if (hasFound) {
                    s = s.replaceFirst(key, replacement);
                }
                
                continue;
            } 
            
            if (!hasFoundFinal) {
                break;
            }

            i=0; hasFoundFinal = false;
        }
        
        return s;
    }
    
    public void run() {
        String s = "ACACACACACAC";
        System.out.println(solution(s));
    }
}