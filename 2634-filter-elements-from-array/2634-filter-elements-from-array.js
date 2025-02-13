/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let tem=[]
    for(let i=0;i<arr.length;i++)
    {
        if(fn(arr[i],i))
        {
            tem.push(arr[i])
        }
    }
    return tem;
};