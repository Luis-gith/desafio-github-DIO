## Comandos importantes do GitBash

- ### Criar e Inicializar

  - git init: inicializa diretório como repositório git;

  - git init [nome do repositório]: cria ou inicializa um novo repositório git;

  - git clone [url]: utilizado para baixar os arquivos mais recentes da URL fornecida; 

    

- ### Staging e Commit(ocorrem em nível local)

  - git add [file]: adiciona um arquivo da working tree na área de staging/branch atual;

  - git add * : adiciona um ou mais arquivos da working tree na área de staging/branch atual;

  - git add . : coloca todos os arquivos do repositório em stage na área de staging;

  - git rm [file]: deleta um arquivo do diretório;

  - git status: lista todos os arquivos a serem commitados;

  - git diff: lista os conteúdos alterados que já estão em stage mas não foram commitados;

  - git commit -a: commita todas as modificações ocorridas no repositório atual;

  - git commit -m "mensagem": adiciona uma mensagem ao seu commit (pode ser misturado com -a colocando essa flag após as aspas)

  - git reset [file]: remove o arquivo do stage revertendo as mudanças no diretório;

  - git reset [commit] remove o arquivo do stage revertendo as mudanças para o estágio do commit especificado;

    

- ### Branch e Merge 

  - git branch: lista todos os branches disponíveis no repositório atual;

  - git branch [nome]: cria um novo branch;

  - git branch -d [nome do branch]: deleta um branch;

  - git checkout [nome do branch]: faz o checkout(te move) para o branch especificado;

  - git checkout -b [nome do branch]: cria o branch e faz checkout de uma vez só;

  - git merge [nome do branch]: junta o branch atual com um especificado

    

- ### Atualizar

  - git push [nome do diretório ou 'origin' se for aquele em que você está] [nome do branch];<br>ex: {git push origin main} ou {git push /c/directory_name/lasagna_recipe main}: empurra os commits ao repositório;
  - git push -all [nome do diretório]: empurra todos os branches ao repositório remoto;
  - git pull [link do repositório]: puxa e junta as mudanças do servidor para o diretório local;













