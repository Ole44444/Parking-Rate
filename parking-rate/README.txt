Oppgave 1,2 og 4 ligger i calculateRate i M1,M2,M3 henholdsvis. 
Inn og ut verdiene får jeg fra Get requesten, i formatet "yyyy-MM-dd HH:mm:ss".
Det er samme format på alle sonene.
Eksempelvis localhost:8080/takst/M1?start=2021-09-09 15:34:54&end=2021-09-09 16:35:55

Oppgave 3 er implimentert i restkontrolleren.

Oppgave 5:  For å lette på trykket med mange requests ville jeg brukt satt opp multithreading så vi kan håndtere
flere requests samtidig og dermed øke kapasiteten.