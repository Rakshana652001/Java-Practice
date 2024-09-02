var today = new Date();

var newYear = new Date(today.getFullYear(), 0, 1);

if (today.getMonth() > 0 || (today.getMonth() === 0 && today.getDate() > 1)) 
{
    newYear.setFullYear(newYear.getFullYear() + 1);
}

var one_day = 1000 * 60 * 60 * 24;
var daysLeft = Math.ceil((newYear.getTime() - today.getTime()) / one_day);

console.log(daysLeft + " days left for New Year");