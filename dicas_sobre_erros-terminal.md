# Erros comuns que encontrei

- *Another git process seems to be running in this repository*
  - rodar o comando [rm -f .git/index.lock] tem funcionado. Parece que o problema acontece<br>quando os commits conflitam e, para proteger o index original o terminal roda uma "fechadura"<br>[index.lock], que pode ser removida por esse comando. 