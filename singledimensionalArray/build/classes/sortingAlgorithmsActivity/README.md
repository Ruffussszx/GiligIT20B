# Documentation



## Briefly explain what your Java program does.



Ang akong Java program nga "SortingAlgorithms.java" kay nag-organize sa mga number gikan sa pinakagamay hangtod sa pinakadako o ascending order. Gigamit niini ang tulo sa sorting algorithms: Bubble Sort, Selection Sort, ug Insertion Sort.
 Ang kada algorithm naa sa kaugalingon nga class, apan parehas ra sila og gigamit nga set of numbers. Bisan og lain-lain ang ilang pamaagi sa pag-sort, parehas ra gihapon ang resulta nga ilang makuha.



## Bubble Sort

Ang akong pagsabot sa Bubble Sort kay ang outer loop mao ang nagkontrol sa balik-balik nga sorting process. Kada mahuman ang inner loop, ang pinakadako nga number ibutang na sa pinakatuong position, mao nga maminusan og usa ang range sa index aron dili na maapil sa sunod nga comparison.
Samtang ang inner loop mao ang nag-compare sa magka tapad nga numbers. Kung mas dako ang left value kaysa right value, mag-swap sila gamit ang temporary variable. Kung dili true ang condition, molaktaw ra siya sa swapping ug mopadayon sa sunod nga index. Balik-balikon kini nga process hangtod ma-arrange na ang tanan numbers gikan sa pinakagamay hangtod sa pinakadako.


## Selection Sort

Ang akong pagsabot sa Selection Sort kay agian niya ang mga index aron pangitaon ang pinakagamay nga number ug ibutang kini sa current index. Ang outer loop mao ang nagcontrol sa sorting process, samtang ang inner loop mao ang mangita sa pinakagamay nga value gamit ang `minIndex`. Kada makakita siyag mas gamay nga number, i-update niya ang `minIndex` hangtod mahuman ang pag-check sa tanan remaining values. Human ana, mag-swap na gamit ang temporary variable aron ibalhin ang pinakagamay nga number sa saktong position. Balik-balikon niya nga proseso hangtod ma-sort na ang tanan numbers gikan sa pinakagamay hangtod sa pinakadako.



## Insertion Sort

Sa situation sa Insertion wra rakag gadula ug cards. Sa outer loop same lng gyapon ga control siya sa loop. Then sulod sa outer loop naay (int key = numbers\[i]) siya ang mag hold sa value nga i swap.  
Sa inner loop kay gina check niya if mas gamay ang value sa gina insert nga number sa left side number then mu-stop ang inner loop hantod makita na niya ang iyang correct position then balik sa outer loop ang so on.



## Differences

Ang kalahian nilang tulo kay ang "Bubble Sort" kay ginagamit lng siya for gagmay kaayu nga mga dataset, ang "Selection sort" kay para sa "gagmay lng gyud nga swaps nga needed" and lastly "Insertion" is para sa hapit na ma sort nga datasets.





**How does each sorting algorithm arrange numbers? What makes their processes different?**

* Ang bubble sort kay mag compare ang mag-apad nga number then kung kinsay mas dako siyay ibutang sa pinaka ulahi, sa Selection kay mangita siyag pinaka-gamay nga number then ibutang sa pinaka-unahan and ang Insertion Sort magkuha siyag number ug isulod sa saktong pwesto. Lahi-lahi gyud ang ilang pamaagi.



**Among the three sorting algorithms, which one do you think is the easiest to understand and implement? Why?**

* Ang Bubble Sort, kay simple lng iyang pamaagi. Compare lng, kung kinsay mas dako ibutang sa right side.



**If the numbers are already sorted, which algorithm do you think would perform better? Explain your answer based on how the algorithms work.**

* Ang Bubble sort ug ang Insertion sort sa Bubble kay muhunod dayun kung wlay ilisan.



**What will happen if you add more numbers to your array? How might this affect the performance of each sorting algorithm?**

* Yes, kay mas mu-anam ug kadako ang size sa array kay mas daghan mang ang i sort maong maka apekto gyud labi na time.



**As a future programmer, why is it important to understand different sorting algorithms instead of using just one?**

* Kay para ma identify kung unsay best gamiton nga sorting algorithm ug makahimo ug paspas nga system or program.
