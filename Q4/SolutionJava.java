int solution(String pattern, String source) { 
    int n = source.length() - pattern.length() + 1; 
    int count = 0; 
    for(int i=0;i<n;i++){ 
        for(int k=0;k<pattern.length();k++){ 
            if(pattern.charAt(k) == '0'){ 
                char c = source.charAt(k+i); 
                if(c == 'a' ||  c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' || c == 'y'){ 
                    if(k == pattern.length()-1) count++; 
                    continue; 
                } 
                else break;     
            } 
            else if(pattern.charAt(k) == '1'){ 
                char c = source.charAt(k+i); 
                if(c != 'a' && c != 'e' &&c != 'i' &&c != 'o' &&c != 'u' && c != 'y'){ 
                    if(k == pattern.length()-1) count++; 
                    continue; 
                } 
                else break;  
            } 
             
             
        } 
    } 
    return count; 
}
