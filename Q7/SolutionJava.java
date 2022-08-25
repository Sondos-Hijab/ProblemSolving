boolean[] solution(int[] numbers, int left, int right) {
    boolean [] res = new boolean [numbers.length];
    
    for(int i=0;i<numbers.length;i++){
        if(numbers[i] % (i+1) == 0 
        && (numbers[i] / (i+1))>=left 
        && (numbers[i] / (i+1))<=right)
        res[i] = true;
        else res[i] = false;
    }
    
    return res;
}
