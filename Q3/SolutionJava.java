int[] solution(int[] a) { 
    if(a.length == 1) return a; 
    int [] b = new int [a.length]; 
    b[0] = a[0] + a[1]; 
    b[a.length-1] = a[a.length-2] + a[a.length-1]; 
     
    for(int i=1;i<a.length-1;i++){ 
        b[i] = a[i-1] + a[i] + a[i+1]; 
    } 
     
    return b; 
}
