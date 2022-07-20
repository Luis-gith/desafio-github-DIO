### [*GUIA*](https://warcontent.com/guia-angular-lifecycle/)

- [constructor](https://cursos.alura.com.br/forum/topico-constructor-vs-ngoninit-109622)
- **ngOnChanges:** chamado uma vez na criação e, após isso, apenas em caso de alterações no componente
- **ngOnInit:** chamado uma única vez quando o componente é inicializado
- **ngDoCheck:** chamado a cada ciclo de detecção de alterações (uso recomendado em alterações não detectadas pelo Angular)
- ngAfterContentInit: chamado após o carregamento do conteúdo externo inserido no componente. Primeiro o componente inicializa e, posteriormente, os elementos do 'AfterContent' carregam
- ngAfterViewInit: carrega após o conteúdo do componente e de seus filhos finalizarem a inicialização
- ngAfterViewChecked: iniciado a cada vez que o conteúdo é verificado pelo mecanismo de detecção de alterações do Angular
- **ngOnDestroy:** inicializado antes do Angular destruir o componente



https://youtu.be/4Z543sAKmBA