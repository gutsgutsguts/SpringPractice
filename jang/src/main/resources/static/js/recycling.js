$('.count').each(function() { 
  var $this = $(this),
      countTo = $this.attr('data-count');
       
  $({ countNum: $this.text()}).animate({
    countNum: countTo 
  },
  {
    duration: 2000, 
    easing:'linear',
    step: function() {
      $this.text(Math.floor(this.countNum));
    },
    complete: function() { 
      $this.text(this.countNum);
    }
  });  
});



var $li1 = $("#li-1"); 
var $li2 = $("#li-2"); 
var $li3 = $("#li-3"); 
var $li4 = $("#li-4"); 
var $li5 = $("#li-5"); 
var $nextli = $("#nextli")
var $sumit = $("#submit"); 


const progressBar = document.getElementById('progress-bar')
const progressPercent = document.getElementById('progress-percent')

$('#nextli').click(function(){
    

    $li1.hide(1000);
    $li2.hide(1000);
    $nextli.hide(1000);


    $li3.show(1000);
    $li4.show(1000);
    $li5.show(1000);
    $sumit.show(1000);

    progressBar.style.width = '88%';
    progressPercent.innerText = '88%';


})

$('#submit').click(function(){
    alert ("등록 완료 되었습니다");

})
