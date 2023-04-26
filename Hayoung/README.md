<p data-ke-size="size16">&nbsp;</p>
<h2 data-ke-size="size20"><b>[코딩테스트 문제 풀 때 주의&amp;참고할 point]</b></h2>
<div class="moreless-content">
<hr contenteditable="false" data-ke-type="horizontalRule" data-ke-style="style6" />
  <p style="color: #333333; text-align: start;" data-ke-size="size16"><b>1. 시간 제한을 고려할 때<span>&nbsp;</span>연산 횟수로 문제를 해결해야 한다.</b></p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">따라서 문제에서 주어진 시간 제한과 데이터 크기를 바탕으로 어떤 정렬 알고리즘을 사용해야 할 것인지 판단할 수 있다.</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">&nbsp;</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16"><b>🔑시간복잡도</b></p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">알고리즘에서 시간 복잡도는 주어진 문제를 해결하기 위한 연산 횟수이다.</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">일반적으로 수행 시간은 1억 번의 연산을 1초의 시간으로 간주하여 예측한다.</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">연산 횟수는 1초에 1억 번 연산하는 것을 기준으로 생각한다.</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">시간 복잡도는 항상 최악일 때, 즉 데이터의 크기가 가장 클 때를 기준으로 한다.</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16"><b>연산 횟수 계산 방법 : 연산 횟수 = 알고리즘 시간 복잡도 X 데이터의 크기</b></p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">&nbsp;</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16"><b>2. 디버깅으로 변숫값 이외에도 원하는 수식을 입력해 논리 오류를 파악하기</b></p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">코드에서 디버깅하고자 하는 줄에 중단점을 설정, 이때 중단점은 여러 개를 설정할 수 있다</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">IDE 디버깅 기능을 실행하면 코드를 1줄씩 실행하거나 다음 중단점까지 실행할 수 있으며, 이 과정에서 추적할 변숫값도 지정할 수 있다. 이 방법으로 변숫값이 자신이 의도한 대로 바뀌는지 파악할 수 있다.</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">&nbsp;</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16"><b>3. 자료형은 처음부터 long 형으로 선언</b></p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">가장 하기 쉬운 실수는 자료형 범위 오류이다. 이러한 오류를 예방하는 방법은 변수를 처음부터 long형으로 선언하는 것이다. 대부분의 코딩 테스트에서 계산되는 값들은 long형 안에서 표현할 수 있다.</p>
</div>
</div>
