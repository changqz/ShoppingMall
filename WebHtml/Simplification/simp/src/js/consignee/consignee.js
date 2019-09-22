
/**
 * val/value
 * opt/循环的数组
 * 解决el-cascader取不到lable用
 * */

function getCascaderObj(val,opt) {
  return val.map(function (value, index, array) {
    for (let itm of opt) {
      if (itm.value == value) { opt = itm.children; return itm; }
    }
    return null;
  });
}

export {getCascaderObj}
