var s=10,e=12;
var q=2;
var count = 0;

function unEqual(val){
  let prod = val*q;
  let s1 = val.toString();
  let s2 = prod.toString();
  for(i=0;i<s1.length;i++) {
    if (s2.contains(s1.charAt(i))) {
      return false
    }
  }
  return true
}

for(let i=s;i<=e;i++) {
  if(unEqual(i)){
    count++;
  }
}
