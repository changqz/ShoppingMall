/**
 * hA:悬浮到那个class元素上
 * hB:需要过度那个class元素
 * @param hA
 * @param hB
 */
function hoverA(hA,hB) {
  let oA = document.getElementsByClassName(hA);
  let oB = document.getElementsByClassName(hB);

  for (let i = 0; i < oA.length; i++) {
    $(oA[i]).hover( ()=> {
      $(oB[i]).stop(true).animate({"left":"20px"},500);

    }, ()=> {
      $(oB[i]).stop(true).animate({"left":"0px"},500);
    })
  }
}


export { hoverA }
