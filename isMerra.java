public static int isMeera(int[] a){
    int isOdd,first3Even,last3Even, result = 0;
    for(int i = 3; i <a.length -3; i++){
      if(a[i] % 2 != 0){
        isOdd = 1;
      }
    }

    if((a[0] % 2 == 0) && (a[1] % 2 == 0)&& (a[2] % 2 == 0) ){
      first3Even = 1;
    }
     if((a[a.length-1] % 2 == 0) && (a[a.length-2] % 2 == 0)&& (a[a.length-3] % 2 == 0) ){
      last3Even = 1;
    }
    if( isOdd == 1 && first3Even == 1 && last3Even == 1){
      result = 1;
    }
    return result;
  }
