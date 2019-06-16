---


---

<h1 id="proyecto-final---microservicios">Proyecto Final - Microservicios</h1>
<p><img src="https://i.imgur.com/IsE1hx4.png" alt="Portada"></p>
<p><a href="https://www.linkedin.com/in/mtribor/"><img src="https://fatimamartinez.es/wp-content/uploads/2019/02/Logo-Linkedin.png" alt="Smiley face" height="42" width="42"></a><br>
<a href="https://twitter.com/mtribor"><img src="https://cdn1.iconfinder.com/data/icons/logotypes/32/square-twitter-512.png" alt="Smiley face" height="42" width="42"></a><br>
<a href="mailto:mtribor@gmail.com"><img src="https://clipart.info/images/ccovers/1499955332gmail-icon-logo-png.png" alt="Smiley face" height="40" width="45"></a></p>
<h2 id="índice">Índice</h2>
<ul>
<li>
<p><a href="#introducci%C3%B3n-a-la-investigaci%C3%B3n">Introducción a la Investigación</a></p>
</li>
<li>
<p><a href="#ejemplo-pr%C3%A1ctico">Ejemplo práctico: APP Control de clase</a></p>
<ul>
<li><a href="#introducci%C3%B3n">Introducción</a></li>
<li><a href="#microservicios">Microservicios</a></li>
<li><a href="#estructura-de-la-aplicaci%C3%B3n">Estructura de la aplicación</a></li>
<li><a href="#problema">Problema</a></li>
<li><a href="#modelo">Modelo</a></li>
<li><a href="#servicios">Servicios</a></li>
</ul>
</li>
<li>
<p><a href="#desarrollo">Desarrollo</a></p>
<ul>
<li><a href="#entorno-de-desarrollo">Entorno de desarrollo</a></li>
<li><a href="#proyecto-maven">Proyecto Maven</a></li>
<li><a href="#proyecto-multim%C3%B3dulo">Proyecto Multimódulo</a></li>
<li><a href="#spring-boot">Spring Boot</a></li>
<li><a href="#spring-boot---api-rest">Spring Boot - API Rest</a></li>
<li><a href="#spring-boot---api-rest-manejo-de-excepciones">Spring Boot - API Rest: Manejo de Excepciones</a></li>
<li><a href="#modelo">Modelo</a></li>
<li><a href="#spring-data---mongodb">Spring Data: MongoDB</a></li>
<li><a href="#spring-data---postgresql">Spring Data: PostgreSQL</a></li>
<li><a href="#service-discovery">Service Discovery</a></li>
<li><a href="#spring-cloud-gateway">Spring Cloud Gateway</a></li>
<li><a href="#spring-cloud-config-server">Spring Cloud Config Server</a></li>
</ul>
</li>
<li>
<p><a href="#despliegue">Despliegue</a></p>
<ul>
<li><a href="#docker---creaci%C3%B3n-y-ejecuci%C3%B3n-de-im%C3%A1genes">Docker: Creación y ejecución de imágenes</a></li>
<li><a href="#compilaci%C3%B3n-y-ejecuci%C3%B3n-del-proyecto-a-trav%C3%A9s-de-maven">Compilación y ejecución del proyecto a través de Maven</a></li>
<li><a href="#despliegue-a-trav%C3%A9s-de-docker">Despliegue a través de Docker</a></li>
</ul>
</li>
<li>
<p><a href="#conclusi%C3%B3n">Conclusión</a></p>
</li>
<li>
<p><a href="#repositorio-github">Repositorio GitHub</a></p>
</li>
<li>
<p><a href="#bibliograf%C3%ADa">Bibliografía</a></p>
</li>
</ul>
<hr>
<hr>
<hr>
<h2 id="introducción-a-la-investigación">Introducción a la Investigación</h2>
<p>Cuando parece que las tecnologías informáticas están tocando techo, siempre aparecen nuevas ideas que no hacen que revolucionar la industria. Y, como no, ese ha sido el caso de los llamados microservicios.</p>
<p>Los servicios web llevan algún tiempo dando de sí. Adaptándose a las nuevas necesidades que el avance tecnológico ha ido exigiendo. Con lenguajes como Java, y, con grandes pilares como el framework Spring, el desarrollo de APIs se ha transformado como algo cotidiano para cualquier desarrollador Software.</p>
<p>Por supuesto, coexisten en el mercado varios protocolos para estos servicios web, como RESTful o SOAP, los cuales se han mantenido como referencia.</p>
<p>Pero, como toda tecnología, acaba por tener sus limitaciones. Por eso no hace tanto tiempo algunas grandes ideas que pretendían ofrecer servicios universales a través de una de las mayores revoluciones tecnológicas en estos tiempos, el cloud , vinieron a demostrar que el concepto de servicio utilizado hasta ahora podía tener un nuevo giro.</p>
<p>Y aquí es donde nace este nuevo concepto: los microservicios.</p>
<p>Este concepto nace de la necesidad de integrar los distintos lenguajes, frameworks, protocolos de comunicación, y en general, tecnologías que coexisten en el mercado actual. Con aplicaciones desarrolladas en Java, .Net, Angular JS, Node.js, etc.</p>
<p>Es difícil asegurar una comunicación correcta entre todas estas tecnologías, por lo que es necesario construir un marco de trabajo común que intercepte estas comunicaciones y las transforme en un lenguaje común que sea posible su traducción.</p>
<p>Por lo tanto ¿cómo podemos definir la arquitectura de microservicios?</p>
<blockquote>
<p>Se trata de una arquitectura que propone descomponer los distintos<br>
componentes que forman una aplicación hasta transformarlos en módulos<br>
encargados de realizar una única función con una serie de  interfaces<br>
bien definidas. Estos módulos han de ser capaces de operar por sí<br>
mismos y estás totalmente abstraídos del resto del entorno de la<br>
aplicación.</p>
</blockquote>
<hr>
<h3 id="objetivos-teóricos-a-desarrollar">Objetivos teóricos a desarrollar</h3>
<ul>
<li>
<p>Arquitectura de Microservicios:</p>
<ul>
<li>Conceptos clave</li>
<li>Service Discovery</li>
<li>Gateway</li>
<li>Server Config</li>
<li>Ventajas</li>
<li>Inconvenientes</li>
</ul>
</li>
<li>
<p>Api REST</p>
</li>
<li>
<p>Docker</p>
</li>
<li>
<p>Spring Boot y Spring Cloud</p>
</li>
</ul>
<hr>
<p>Todo ello será estudiado e investigado a través del desarrollo de una aplicación basada en<br>
Microservicios que se tomará como ejemplo práctico y a través de la cual se intentaran entender los<br>
conceptos clave de esta arquitectura y su posición actual y a futuro en el mundo Software.</p>
<hr>
<h3 id="tareas-de-desarrollo">Tareas de desarrollo</h3>
<ul>
<li>
<p>Definir los conceptos de nuestro proyecto:</p>
<ul>
<li>Problema: Introducción al problema y reglas de negocio</li>
<li>Modelo: Dominio y entidades</li>
<li>Servicios: Tecnologías y organización</li>
</ul>
</li>
<li>
<p>Desarrollo</p>
<ul>
<li>Desarrollo de microservicios basados en Api REST</li>
<li>Arquitectura de microservicios basada en Spring Cloud</li>
<li>Despliegue: Imágenes Docker y Docker-compose</li>
</ul>
</li>
</ul>
<h2 id="ejemplo-práctico">Ejemplo práctico</h2>
<h3 id="introducción">Introducción</h3>
<p>Cuando pensamos en aplicaciones que puedan llevar a cabo tareas de organización, evaluación, comunicación o envío de material educativo, entre otras. Posiblemente, se nos vengan a la cabeza una serie de aplicaciones de escritorio que deberemos utilizar de forma individual e independiente.</p>
<p>Pero, en la actualidad, ¿seríamos capaces de centralizar todas estas aplicaciones para que funcionen de forma conjunta? ¿Es posible crear un entorno tecnológico capaz de integrar todas las herramientas necesarias para administrar todos los datos?</p>
<p>Estas dudas, se basan en el concepto común de aplicación, ya que éste hace referencia a la arquitectura monolítica en las que se basan todas las aplicaciones de escritorio que utilizamos diariamente.</p>
<p>Entonces, la respuesta es que sí. En la actualidad, con las tecnologías basadas en la nube, las distintas tecnologías de bases de datos, y las aplicaciones web, ya no es una idea inconcebible el hecho de crear sistemas integrados que manejen todos estos datos y sean capaces de llevar a cabo tareas muy distintas de forma orquestada.</p>
<p>Pero ¿qué tipo de aplicaciones? ¿cómo se realiza la integración entre las mismas? ¿bajo qué tecnología? ¿han de integrarse en distintos sistemas operativos?</p>
<p>En este punto, podríamos hablar de los conceptos de elasticidad, alta cohesión y bajo acoplamiento, para los cuales existen muchas arquitecturas software que pueden aportarnos estas propiedades en una aplicación.</p>
<p>En este caso, posiblemente, el uso de una arquitectura basada en microservicios sería la más correcta ya que, de cierta forma, podrían integrarse servicios que ya se encuentren funcionales junto con servicios nuevos totalmente independientes. Además, esta arquitectura permitirá que nuestra aplicación sea elástica , de tal forma que permitirá nuevas integraciones de servicios independientes en un futuro.</p>
<p>Gracias a este patrón de diseño, podremos tener acceso a una única aplicación en forma de servicio cloud, que interiormente, se compondrá de distintos servicios, o módulos, que podrán trabajar de forma independiente o conjunta según las necesidades del usuario y, sobre todo, de forma anónima entre sí.</p>
<p>Con todo esto, se podrá disponer de una aplicación que conste de distintos servicios totalmente independientes para que podrán ser utilizados en las distintas tareas y en distintos dispositivos a través de otras aplicaciones cliente que los consuman.</p>
<p>Con este supuesto, da comienzo una investigación que tratará de averiguar los entresijos de esta tecnología y su posible aportación positiva a un entorno educativo en el que, cada vez más, es necesario que se integren las tecnologías para un mejor manejo de datos.</p>
<hr>
<h3 id="microservicios">Microservicios</h3>
<p>Hasta ahora, los sistemas se han estructurado mediante grandes aplicaciones en forma de monolitos, haciendo que el mantenimiento y la evolución sea demasiado compleja conforme estos proyectos se agrandan. En frente a esta tecnología, tenemos a los microservicios, que consisten en una arquitectura software que implementa servicios mediante la colaboración de otros servicios más pequeños y autónomos.</p>
<p>Cada microservicio se centra en una parte individual del modelo negocio. Así, se consigue la abstracción del resto del sistema de los detalles concretos de la implementación.</p>
<p>Además, esto permite que el despliegue de estos servicios pueda realizarse de forma individual y separada, por lo que el usuario final no tiene que ser conocedor de qué servicios son los que le están ofreciendo los recursos que está pidiendo. Esto, favorece, entre otras cosas, la escalabilidad.</p>
<p>Así pues, podemos enumerar ciertas ventajas de utilizar una arquitectura basada en microservicios para nuestra aplicación:</p>
<ul>
<li>
<p>Facilita la escalabilidad y la hace más eficiente</p>
</li>
<li>
<p>La capacidad de prueba de cada microservicio es mayor.</p>
</li>
<li>
<p>El mantenimiento se hace más sencillo y eficiente.</p>
</li>
<li>
<p>Permite que en un mismo proyecto coexistan distintas tecnologías: Múltiples lenguajes, bases de datos, protocolos, etc.</p>
</li>
<li>
<p>Hace mucho más sencillo el desarrollo paralelo de las distintas funcionalidades de la aplicación y, además, permite que este desarrollo sea independiente.</p>
</li>
<li>
<p>Permite que los despliegues sean independientes, lo que aumenta la tolerabilidad a fallos graves.</p>
</li>
</ul>
<img src="https://i.imgur.com/xYw0IRS.png">
<hr>
<h3 id="estructura-de-la-aplicación">Estructura de la aplicación</h3>
<p>La arquitectura basada en microservicios puede tener tantas capas, servicios o componentes, como se requieran. Generalmente, las capas básicas de esta arquitectura son: API Gateway, Service Discovery, Servicios y sus correspondientes bases de datos.</p>
<p>Algunos ejemplos de arquitecturas de aplicaciones basadas en microservicios pueden ser:</p>
<img src="https://i.pinimg.com/originals/ce/b4/a5/ceb4a506ef82dee71643bfa6bec8f498.png">
<img src="https://docs.huihoo.com/apache/mesos/chrisrc.me/assets/microservice_ms_overview.png">
<p>Como vemos, una arquitectura de Microservicios se basa en dividir los grandes servicios web utilizados hasta ahora, en pequeños servicios independientes con un dominio más ligero y una lógica con una menor complejidad.</p>
<p>En el caso anterior, por ejemplo, podemos ver como la aplicación posee hasta seis micro-servicios para dar un servicio común a través de la interfaz de aplicación, o API, llamada Gateway en este caso.</p>
<p>Como vemos, estos servicios también pueden respaldarse entre sí, aunque estos se mantengan totalmente independientes. Esto se debe al principio de deslocalización en el que se basan los microservicios.</p>
<p>Por otro lado, podemos ver como no es necesario que todos los servicios mantengan los mismos protocolos de comunicación, es decir, generalmente existirá un mismo protocolo de comunicación, que normalmente será el REST, pero es posible que cada servicio pueda implementar otro u otros protocolos para hacer más flexible la aplicación.</p>
<hr>
<h3 id="problema">Problema</h3>
<p>Se busca mantener un intercambio de información sobre las tareas diarias de las materias, entre los alumnos y el profesor, de una forma ordenada y eficiente.</p>
<p>Es decir, nuestro problema reside en encontrar una forma de realizar un seguimiento centralizado para todas las tareas de una materia. De tal forma que el profesor pueda saber qué alumnos han realizado la tarea, y en caso de no haberla realizado, poder encontrar una breve explicación de por<br>
qué.</p>
<p>Por otro lado, el profesor desea conocer qué opinan los alumnos de la dificultad, o el volumen de trabajo, de las tareas que se han pedido. De tal forma que cada alumno pueda valorarla y, además, escribir un breve comentario.</p>
<p>Finalmente, es importante que los alumnos puedan tener acceso a las tareas que se han pedido de forma ordenada cronológicamente. Es decir, de alguna forma, que dichas tareas estén reflejadas en un calendario para que sea fácil para los alumnos, y a la vez para el profesor, organizar dichas tareas en el tiempo.</p>
<hr>
<h3 id="modelo">Modelo</h3>
<p>Una vez abordado el problema, se puede construir el modelo para la aplicación. Para ello han de definirse los conceptos con los que se van a trabajar:</p>
<ul>
<li>
<p>Tareas : Son las distintas actividades que se realizan en una materia. Pueden ser de distintos tipos, entre los que se contemplan: Deberes, Exámenes, Talleres, Entregas de trabajos, etc.</p>
</li>
<li>
<p>Seguimientos : Representan los datos que intercambian los alumnos para cada tarea con el profesor.Corresponden a la valoración del trabajo realizado, la valoración de la dificultad de la tarea y los respectivos comentarios a ambas valoraciones.</p>
</li>
<li>
<p>Profesores : Son los encargados de administrar las tareas, es decir, son los encargados de crear, modificar y eliminar las tareas. Además, podrán acceder a los comentarios de los alumnos.</p>
</li>
<li>
<p>Alumnos : Pueden acceder a la información de cada tarea. Además, deberán interactuar con cada tarea para realizar el seguimiento de éstas. Para ello deberán valorar cada tarea y escribir un comentario para cada valoración antes de la fecha de fin de la tarea. Aunque podrán escribir comentarios tras la fecha de fin que, por defecto, valorarán su trabajo realizado como “Fuera de plazo”.</p>
</li>
</ul>
<img src="https://i.imgur.com/RrsCJl1.png">
<hr>
<h3 id="servicios">Servicios</h3>
<h4 id="calendario-tareas">Calendario (Tareas)</h4>
<ul>
<li>
<p>Descripción : Este servicio soporta las peticiones referidas a las tareas de cada materia en una fecha y horario concreto sobre un calendario y un profesor concreto.</p>
</li>
<li>
<p>Tecnología : Api Rest, Spring-Boot, Spring-MVC, Lombock, Java 8.</p>
</li>
<li>
<p>Funcionalidad : Manejo de tareas: Creación, modificación, borrado y lectura de las tareas generadas.</p>
</li>
<li>
<p>Modelo : Una colección “Tareas” que maneja documentos de tipo “Tarea” que contienen referencias a las materias, alumnos y profesores que la componen.</p>
</li>
<li>
<p>Base de datos : MongoDB.</p>
</li>
</ul>
<h4 id="seguimiento-valoraciones-y-comentarios">Seguimiento (Valoraciones y comentarios)</h4>
<ul>
<li>
<p>Descripción : Servicio encargado de manejar las peticiones sobre la realización de las tareas por parte de los alumnos y la valoración de la carga de trabajo y la dificultad de las tareas asignadas.</p>
</li>
<li>
<p>Tecnología : Api Rest, Spring-Boot, Spring-MVC, Lombock, Java 8.</p>
</li>
<li>
<p>Funcionalidad : Manejo de controles o seguimientos para las tareas existentes. Creación de un control para una tarea, borrado, modificación y lectura.</p>
</li>
<li>
<p>Modelo : Una tabla “Seguimientos” que contiene elementos “Seguimiento” los cuales, cada uno, tienen una referencia a cada tarea y cada alumno correspondiente.</p>
</li>
<li>
<p>Base de datos : PostgreSQL.</p>
</li>
</ul>
<h4 id="api-gateway">API Gateway</h4>
<ul>
<li>
<p>Descripción : Servicio encargado de centralizar las llamadas a los demás servicios a través de una URI que hace de entrada de peticiones.</p>
</li>
<li>
<p>Tecnología : Api Rest, Spring-Boot, Spring-Cloud Gateway sobre Java 8.</p>
</li>
<li>
<p>Funcionalidad : Se encarga de centralizar las llamadas a la aplicación en una URI principal que redirige las llamadas a los servicios configurados internamente.</p>
</li>
</ul>
<h4 id="service-discovery">Service-Discovery</h4>
<ul>
<li>
<p>Descripción : Servicio encargado de registrar las direcciones a los microservicios que componen la aplicación y redireccionar las peticiones hacia estos.</p>
</li>
<li>
<p>Tecnología : Spring-Boot, Spring-Cloud y Netflix Eureka sobre Java 8</p>
</li>
<li>
<p>Funcionalidad : Encargado de redirigir las llamadas realizadas a cada servicio a través de una URI genérica a la dirección del servidor en el que se encuentra dicho servicio.</p>
</li>
</ul>
<h4 id="server-config">Server Config</h4>
<ul>
<li>
<p>Descripción : Este servicio está a la espera de recibir peticiones por parte del resto de servicios, para que se les proporcione la configuración necesaria para su ejecución en el entorno definido. Cuando este servicio recibe estas peticiones, recoge los archivos de configuración para cada servicio (de extensión “.yml” o “.properties”) de un repositorio definido para luego proporcionárselo al servicio que haya realizado la petición.</p>
</li>
<li>
<p>Tecnología : Spring-Boot y Spring-Cloud: Spring Cloud Config Server sobre Java8</p>
</li>
<li>
<p>Funcionalidad : Busca sobre un repositorio los archivos de configuración de cada servicio que los solicite.</p>
</li>
</ul>
<p>En nuestro caso, la arquitectura de nuestra aplicación será la siguiente:</p>
<img src="https://i.imgur.com/kvNxe7K.png">
<h2 id="desarrollo">Desarrollo</h2>
<h3 id="entorno-de-desarrollo">Entorno de desarrollo</h3>
<h4 id="intellij-idea--jetbrains">IntelliJ IDEA- JetBrains</h4>
<p>Para el desarrollo de esta aplicación se utilizará el reconocido IDE IntelliJ. Esto se debe a que posiblemente se trata del IDE que, actualmente, incorpora más y mejores herramientas para el desarrollo de aplicaciones web.</p>
<p>En este caso, además, se trata de un IDE con total compatibilidad con el desarrollo de microservicios.</p>
<img src="https://intellij-rust.github.io/assets/quick-start/idea-new-project.png">
<img src="https://i.imgur.com/DCkqkLs.jpg">
<p>Web  <a href="https://www.jetbrains.com/idea/">https://www.jetbrains.com/idea/</a></p>
<hr>
<h4 id="maven-–-apache">Maven – Apache</h4>
<p>Maven nace como una herramienta dedicada a facilitar la compilación y generación de ejecutables para aplicaciones. Así como para facilitar la gestión de dependencias y librerías.</p>
<p>Actualmente, para todo desarrollador, es necesario tener en el desarrollo de sus proyectos un gestor de dependencias y librerías. Esto se debe a que una de las grandes premisas de la programación se basa en la no repetición de código, la generalización, la parametrización y la modularidad.</p>
<p>En este caso se utilizará Maven como gestor de dependencias para nuestro proyecto, ya que es uno de los más potentes del mercado y con una gran versatilidad con respecto al desarrollo de microservicios.</p>
<p>La administración de las dependencias y librerías utilizadas en el proyecto se realiza a través de unos archivos con formato XML y al que nos referiremos como el archivo POM de la aplicación (POM.xml).</p>
<p>Un ejemplo de archivo POM utilizado en el desarrollo de esta aplicación, puede ser este:</p>
<pre class=" language-xml"><code class="prism  language-xml"><span class="token prolog">&lt;?xml version="1.0" encoding="UTF-8"?&gt;</span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>project</span> <span class="token attr-name">xmlns</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>http://maven.apache.org/POM/4.0.0<span class="token punctuation">"</span></span>
<span class="token attr-name"><span class="token namespace">xmlns:</span>xsi</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>http://www.w3.org/2001/XMLSchema-instance<span class="token punctuation">"</span></span>
<span class="token attr-name"><span class="token namespace">xsi:</span>schemaLocation</span><span class="token attr-value"><span class="token punctuation">=</span><span class="token punctuation">"</span>http://maven.apache.org/POM/4.0.
http://maven.apache.org/xsd/maven-4.0.0.xsd<span class="token punctuation">"</span></span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>modelVersion</span><span class="token punctuation">&gt;</span></span>4.0.0<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>modelVersion</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>packaging</span><span class="token punctuation">&gt;</span></span>pom<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>packaging</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>parent</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-boot-starter-parent<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>2.1.5.RELEASE<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>relativePath</span><span class="token punctuation">/&gt;</span></span> <span class="token comment">&lt;!-- lookup parent from repository --&gt;</span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>parent</span><span class="token punctuation">&gt;</span></span>


<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>modules</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>module</span><span class="token punctuation">&gt;</span></span>boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>module</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>module</span><span class="token punctuation">&gt;</span></span>model<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>module</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>module</span><span class="token punctuation">&gt;</span></span>service<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>module</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>module</span><span class="token punctuation">&gt;</span></span>controller<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>module</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>module</span><span class="token punctuation">&gt;</span></span>repository<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>module</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>modules</span><span class="token punctuation">&gt;</span></span>


<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>dam.mtribor<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>task-control-service<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>0.0. 1 - SNAPSHOT<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>name</span><span class="token punctuation">&gt;</span></span>task-control-service<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>name</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>description</span><span class="token punctuation">&gt;</span></span>Homework Control service for the Task Control
APP.<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>description</span><span class="token punctuation">&gt;</span></span>


<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>properties</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>java.version</span><span class="token punctuation">&gt;</span></span>1.8<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>java.version</span><span class="token punctuation">&gt;</span></span>


<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>netflix.eureka.version</span><span class="token punctuation">&gt;</span></span>2.1.1.RELEASE<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>netflix.eureka.version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>spring-cloud.version</span><span class="token punctuation">&gt;</span></span>Greenwich.SR1<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>spring-cloud.version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>properties</span><span class="token punctuation">&gt;</span></span>

<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependencies</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-boot-starter-data-jpa<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-boot-starter-web<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.cloud<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-cloud-starter-config<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.cloud<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-cloud-starter-netflix-eureka-
client<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.retry<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-retry<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-boot-starter-aop<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>

<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.postgresql<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>postgresql<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>scope</span><span class="token punctuation">&gt;</span></span>runtime<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>scope</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.projectlombok<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>lombok<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>optional</span><span class="token punctuation">&gt;</span></span>true<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>optional</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>io.springfox<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>springfox-swagger2<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>2.9.2<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>io.springfox<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>springfox-swagger-ui<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>2.9.2<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependencies</span><span class="token punctuation">&gt;</span></span>


    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependencyManagement</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependencies</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.cloud<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-cloud-dependencies<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>${spring-cloud.version}<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>type</span><span class="token punctuation">&gt;</span></span>pom<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>type</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>scope</span><span class="token punctuation">&gt;</span></span>import<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>scope</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependencies</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependencyManagement</span><span class="token punctuation">&gt;</span></span>

<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>build</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>plugins</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.apache.maven.plugins<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>maven-surefire-plugin<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>2.22.0<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>io.fabric8<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>fabric8-maven-plugin<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>3.5.41<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>configuration</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>generator</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>includes</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>include</span><span class="token punctuation">&gt;</span></span>spring-boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>include</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>includes</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>config</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>spring-boot</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>registry</span><span class="token punctuation">&gt;</span></span>eu.gcr.io<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>registry</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>name</span><span class="token punctuation">&gt;</span></span>task-control-service:%v<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>name</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>spring-boot</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>config</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>generator</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>configuration</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>plugins</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>build</span><span class="token punctuation">&gt;</span></span>

<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>project</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<p>Web --&gt; <a href="https://maven.apache.org/">https://maven.apache.org/</a></p>
<hr>
<h4 id="spring-framework-–-pivotal">Spring Framework – Pivotal</h4>
<img src="https://i.imgur.com/fpl0rGF.png">
<p>Spring nace como sustituto, o complemento, al modelo EJB de Java referente a la plataforma Java EE. Es decir, fue diseñado con la intención de agilizar el desarrollo de aplicaciones empresariales.</p>
<p>Tras más de una década de evolución y desarrollo hoy en día Spring ofrece una serie de módulos que pueden trabajar, o no, de forma conjunta y que conforman el llamado “Spring Framework”.</p>
<p>Entre los módulos más relevantes para este proyecto, encontramos:</p>
<ul>
<li>
<p><strong>Spring Boot</strong>: Se trata del módulo que permite y arrancar y configurar de forma rápida y sencilla aplicaciones basadas en Spring.</p>
</li>
<li>
<p><strong>Spring Cloud</strong>: Da a los desarrolladores herramientas para crear de forma rápida y sencilla aplicaciones distribuidas basadas en entornos en la nube y facilita la configuración de forma centralizada y “cloud-native”. Spring Data : Su propósito es unificar y facilitar el acceso a distintos tipos de tecnologías de persistencia, tanto a bases de datos relacionales como a las del tipo NoSQL.</p>
</li>
</ul>
<p>Web --&gt; <a href="https://spring.io/">https://spring.io/</a></p>
<hr>
<h4 id="postman---postdot-technologies">Postman - Postdot Technologies</h4>
<p>Postman nace como una extensión para el navegador web Google Chrome con la propuesta de hacer más fácil a los desarrolladores realizar pruebas con aplicaciones web realizando peticiones específicas y analizar sus respuestas.</p>
<p>Postman se compone de diferentes herramientas que permiten realizar tareas diferentes con las API REST. Desde la creación de peticiones a APIs, tests de validación del comportamiento de éstas, la posibilidad de crear diferentes entornos de trabajo y parametrizarlos y, además, ofrece la posibilidad de hacer todas estas tareas junto con tu equipo de desarrollo, ofreciendo la posibilidad compartir tus datos con otros compañeros y de exportar los mismos.</p>
<p>Actualmente Postman se presenta como una aplicación de escritorio que permite realizar todas estas tareas de una forma más potente y con la integración de ciertos servicios en la nube.</p>
<img src="https://www.getpostman.com/img/screens/postman-default-view.png">
<p>Web --&gt; <a href="https://www.getpostman.com/">https://www.getpostman.com/</a></p>
<hr>
<h4 id="proyecto-maven">Proyecto Maven</h4>
<p>Este proyecto se construirá utilizando el administrador de librerías y dependencias Maven. Por lo tanto, primero, han de configurarse adecuadamente los metadatos de la aplicación como son el Group ID o el Artifact ID de cada componente o módulo, entre otros.</p>
<p>En nuestro caso, el patrón que se utilizará como group-id en todos los proyectos es el siguiente: “dam.mtribor”. Donde “dam” corresponde a “Desarrollo de Aplicaciones Multiplataforma” y “MTribor” al nombre del desarrollador o la organización, empresa o equipo de trabajo.</p>
<p>Por otro lado, el artifact-id hace referencia al identificador que Maven utilizará para resolver las dependencias entre módulos. Es decir, cada módulo que se desarrolle contendrá un archivo “pom.xml” en el que constará, entre otros datos, su id de artefacto para que los demás módulos puedan acceder a sus paquetes. Generalmente, este id contendrá el nombre del módulo que se está desarrollando, como por ejemplo “model”, “repository”, “gateway”, etc.</p>
<p>Además, para cada módulo, será necesario crear el archivo “pom.xml” para las dependencias entre módulos y con librerías externas que se necesiten. Para esto, siempre es necesario tener en cuenta que estas dependencias se traspasan de padre a hijo, pero no al revés.</p>
<p>Para conocer qué dependencias necesita nuestro proyecto, es posible realizar búsquedas sobre qué tipos de librerías se ofrecen que nos puedan resultar de utilidad. Luego, solo será necesario copiar sus descriptores de Maven y colocarlos en los archivos POM de cada módulo.</p>
<p>Por ejemplo, las dependencias básicas para crear una aplicación Spring Boot las podemos encontrar en la web principal de Spring o en el repositorio de Maven Central. Para crear una aplicación básica con Spring Boot, tan solo necesitaremos la siguiente dependencia en el POM de nuestra aplicación:</p>
<pre class=" language-xml"><code class="prism  language-xml">
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-boot-starter-web<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<p>Además, será necesario establecer nuestra aplicación como hija de una aplicación Spring Boot. Para ello, solo habrá que añadir las siguientes líneas:</p>
<pre class=" language-xml"><code class="prism  language-xml">
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>parent</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-boot-starter-parent<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>2.1.5.RELEASE<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>relativePath</span><span class="token punctuation">/&gt;</span></span> <span class="token comment">&lt;!-- lookup parent from repository --&gt;</span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>parent</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<p>Por último, será necesario establecer el plugin de Spring Boot a través del cual de compilará nuestro proyecto y el cual permitirá a Spring analizar el proyecto en busca de las dependencias y los java-beans necesarios para la ejecución de su contexto:</p>
<pre class=" language-xml"><code class="prism  language-xml">
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>build</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>plugins</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-boot-maven-plugin<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>plugins</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>build</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<p>Las librerías disponibles las podemos encontrar en la web oficial de Maven:<br>
<a href="https://mvnrepository.com/">https://mvnrepository.com/</a>. Además, existen otras dos webs muy útiles para nuestro caso:</p>
<ul>
<li>
<p>Search Maven: Una web creada por la comunidad que facilita la búsqueda de librerías<br>
actualizadas y funcionales en el repositorio de Maven - <a href="https://search.maven.org/">https://search.maven.org/</a></p>
</li>
<li>
<p>Spring Initializr: Se trata de una herramienta oficial de los desarrolladores del famework Spring, a través de la cual se puede inicializar un proyecto sencillo con la mayoría de las librerías esenciales para el uso del framework - <a href="https://start.spring.io/">https://start.spring.io/</a></p>
</li>
</ul>
<hr>
<h4 id="proyecto-multimódulo">Proyecto Multimódulo</h4>
<p>Desde siempre se ha hecho uso de librerías, externas o internas, para ser reutilizadas durante el desarrollo software. Es decir, reutilizar software ya existente y de esta forma generalizar ciertas funcionalidades comunes.</p>
<p>En este caso, si nos basamos en el servicio desarrollado para el Control de las tareas de clase para cada alumno, dicho servicio se encuentra dividido en seis módulos distintos:</p>
<img src="https://i.imgur.com/CRR6sFP.png">
<ul>
<li>
<p>Boot: Es el módulo donde encontraremos la clase de ejecución principal o “main”. Contendrá cierta configuración de importancia y será el módulo hijo del paquete principal.</p>
</li>
<li>
<p>Controller: Define el manejo de las peticiones HTTP recibidas. En este caso, se definirá con la anotación @RestController y se deberán definir las rutas para las uris de acceso, así como el método de cabecera que deberá llevar la petición (GET, POST, PUT, PATCH, etc.)</p>
</li>
<li>
<p>Service: Se trata de la capa donde reside la lógica de nuestra aplicación, es decir, será el módulo encargado de interactuar con el modelo de datos, el repositorio y los datos y peticiones recibidos desde la capa controlador.</p>
</li>
<li>
<p>Repository: En este módulo se definirá el manejo de datos. Estos datos podrán ser recibidos a través de interfaces de conexión con bases de datos, o datos externos recibidos a través de APIs externas o propias.</p>
</li>
<li>
<p>Model: Se trata de la capa “dominio” de nuestra aplicación, y define las entidades y objetos con los que nuestra aplicación trabajará.</p>
<ul>
<li>
<p>DTO: Se trata de un módulo opcional que será hijo del módulo “Model” y contendrá sólo los objetos DTO para que puedan ser integrados por otras aplicaciones gracias a que son un módulo.</p>
</li>
<li>
<p>VO: Al igual que el anterior, se trata de un módulo opcional que trata de modularizar la capa de dominio de la aplicación.</p>
</li>
</ul>
</li>
</ul>
<p>De esta forma, a través del gestor Maven, nos encontramos con la posibilidad de construir proyectos basados en módulos, los cuales son gestionados como dependencias Maven a través de los archivos POM que cada uno contiene.</p>
<img src="https://i.imgur.com/iQqoBis.png">
<h2 id="spring-boot">Spring Boot</h2>
<p>Spring Boot nos ofrece crear aplicaciones aplicaciones Spring sin tener que realizar el tedioso proceso de configuración. No es necesario hacer ningún fichero de configuración.</p>
<p>Por ejemplo, para la creación de una aplicación web, Spring Boot, automáticamente nos proporcionará un servidor Tomcat embebido el cual estará configurado y conectado junto con un servlet propio de Spring. Además, por supuesto, toda la configuración por defecto será personalizable.</p>
<p>Podemos resumir el éxito de Spring Boot en las siguientes características:</p>
<ul>
<li>Configuración : Spring Boot cuenta con un complejo sistema de contexto de aplicación, que escanea y analiza la aplicación dividiéndola por componentes en tiempo de compilación y ejecución. Spring Boot es capaz de autoconfigurar todos los aspectos de una aplicación y permitir ejecutarla sin necesidad de definir absolutamente nada.</li>
</ul>
<p>Gestión de dependencias: Tan sólo es necesario indicar el tipo de proyecto que se desarrollará Spring Boot será el encargado de resolver las dependencias necesarias entre módulos y componentes para que la aplicación funcione.</p>
<p>Despliegue : Spring Boot es capaz de ejecutarse tanto como aplicación Stand-alone como aplicación web mediante su servidor web integrado.</p>
<p>Modularidad : Spring Boot se basa en una estructura modular independiente que permite que la comunidad diseñe y proponga nuevos módulos para integrarlos en su desarrollo.</p>
<p>En nuestro caso, al tratarse de una aplicación multimodular y basada en Spring Boot, han de señalarse adecuadamente las dependencias entre módulos. Esto es: a parte de la inyección de dependencias entre módulos, han de añadirse dichas dependencias al POM de cada módulo, ya que cada uno de éstos actúa como si fuera un proyecto independiente y, por lo tanto, los otros módulos<br>
se añaden a él como si fueran una librería.</p>
<p>En el caso de realizar un proyecto multimodular utilizando Spring Boot han de tenerse en cuenta las siguientes advertencias que se han detectado:</p>
<p>Se deben optimizar las dependencias de tal forma que no existan dependencias cíclicas.</p>
<p>Es recomendable crear un módulo “boot” que parta del módulo padre de la aplicación y el cual contenga la clase principal de ejecución para el contexto de Spring. Este contexto será el encargado de escanear nuestro proyecto en busca de todas las clases necesarias en el orden necesario junto a la configuración requerida para que la aplicación Spring se ejecute correctamente.</p>
<pre class=" language-java"><code class="prism  language-java">
<span class="token annotation punctuation">@EnableSwagger2</span>
<span class="token annotation punctuation">@EnableEurekaClient</span>
<span class="token annotation punctuation">@SpringBootApplication</span>
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">TaskControlServicesApplication</span> <span class="token punctuation">{</span>
<span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span>String<span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
SpringApplication<span class="token punctuation">.</span> <span class="token function">_run_</span> <span class="token punctuation">(</span>TaskControlServicesApplication<span class="token punctuation">.</span><span class="token keyword">class</span><span class="token punctuation">,</span> args<span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span><span class="token punctuation">}</span>
</code></pre>
<p>Es necesario colocar la descripción del plugin principal de Spring en el POM del módulo boot antes mencionado, junto a la dependencia con el módulo controlador (@RestController) de la aplicación.</p>
<pre class=" language-xml"><code class="prism  language-xml"><span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>${project.groupId}<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>task-control-service-controller<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>${project.version}<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>scope</span><span class="token punctuation">&gt;</span></span>compile<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>scope</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>


<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>build</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>plugins</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-boot-maven-plugin<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>plugins</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>build</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<p>Mediante Spring Boot tenemos la posibilidad de crear aplicaciones completas ejecutables en pequeños entornos para los cuales ya no es necesario tener un servidor de aplicaciones completo junto con una gran cantidad de recursos.</p>
<p>Spring boot, además, tiene complementos muy interesantes como Spring Cloud con los cuales se nos permite crear aplicaciones “Cloud Native”, o lo que es lo mismo, aplicaciones diseñadas desde el inicio para ser ejecutadas en la nube.</p>
<p>Estas ventajas, son clave para la creación de microservicios, ya que hacen que no sea necesaria la instalación de servidores, así como la necesidad de realizar complejas configuraciones.</p>
<h2 id="spring-boot---api-rest">Spring Boot - API Rest</h2>
<p>Llamamos API al conjunto de funciones y procedimientos que realizan distintas funciones con el fin de ser utilizadas por otro software. Este concepto se encuentra incluido en el concepto software de librería.</p>
<p>Las siglas API vienen del inglés Application Programming Interface, que en español sería Interfaz de Programación de Aplicaciones. Esto se debe a que una API nos permite implementar las funciones y procedimientos que engloba en nuestro proyecto sin la necesidad de programarlas de nuevo. En términos de programación, es una capa de abstracción.</p>
<p>Por otro lado, API REST se define como una librería que se basa totalmente en el estándar de<br>
comunicación HTTP. Dicho de otra forma, una API REST es un servicio que nos aporta funciones<br>
heredadas a través de un servicio web que no es nuestro, dentro de una aplicación propia, de<br>
manera segura.</p>
<p>REST, REpresentational State Transfer, es un tipo de arquitectura de desarrollo web que se apoya totalmente en el estándar HTTP. Por ello, al ser un estándar de red, requiere de ciertas restricciones que permitan la correcta comunicación entre usuarios. Estas restricciones son:</p>
<ul>
<li>
<p>Conexión cliente-servidor libre ; El cliente no necesita saber los detalles de la implementación del server, y este tampoco debe preocuparse por cómo se usan los datos que envía.</p>
</li>
<li>
<p>Cada petición enviada al servidor es independiente.</p>
</li>
<li>
<p>Compatibilidad con un sistema de almacenamiento en caché.</p>
</li>
<li>
<p>Cada recurso del servicio REST debe tener una única dirección , manteniendo una interfaz genérica.</p>
</li>
<li>
<p>Permite utilizar diferentes capas para la implementación del servidor.</p>
</li>
</ul>
<p>En nuestro caso, los servicios desarrollados siguen este patrón, ya que a día de hoy, REST y JSON, son la combinación más utilizada para el desarrollo de APIs, y la que un mayor apoyo de parte de la comunidad poseen.</p>
<p>Con esto, además, Spring Framework posee toda una serie de librerías, módulos y funcionalidades a disposición de los desarrolladores para crear nuevas APIs REST. Para nosotros, algunas de estas características son:</p>
<p>La anotación @RestController , que indica que la clase Java que la contenga será la encargada de manejar las peticiones HTTP que nuestra aplicación recibirá, y que, además, nuestra aplicación ofrecerá respuestas acordes a las restricciones REST. En nuestro caso, como se ha indicado anteriormente, se oferecerán respuestas JSON.</p>
<p>Además, Spring nos ofrece una serie de anotaciones para indicar al controlador REST qué métodos Java manejaran qué peticiones HTTP. Estas peticiones HTTP, pueden ser desde GET, POST, PUT PATCH, OPTIONS, DELETE, etc. Por lo tanto, Spring nos ofrece las siguientes anotaciones para cada operación: @GetMapping, @PostMapping, @PutMapping, @DeleteMapping , etc.</p>
<p>Es recomendable, que los métodos de la clase “Controller” devuelvan objetos del tipo ResponseEntity , donde “T” hace referencia al tipo de objeto que será transformado a JSON a través del traductor interno de Spring, llamado JackSon. Estos objetos, además de incluir el objeto Java a traducir como respuesta, nos permiten personalizar las cabeceras HTTP para dar unas respuestas más complejas y completas.</p>
<p>Como ya hemos dicho, REST nos permite implementar los métodos HTTP y es fácil observar, que existen similitudes entre estos y las operaciones de una interfaz CRUD. Esto se debe a que realmente, una petición GET estará asociada a un query SELECT, una petición POST estará asociada a un query INSERT, una petición PUT a un UPDATE y así sucesivamente. Esto no tiene por qué ser<br>
siempre así, ya que por ejemplo, podría darse el caso de que una API consulte información de los recursos o procese ciertos datos para dar una respuesta sencilla. Esto dependerá de las necesidades del proyecto, pero en general funciona de la manera antes mencionada.</p>
<p>Para nuestro desarrollo, en el servicio “Task Control”, podemos ver cómo queda definido una interfaz API y su implementación “Controller”:</p>
<pre class=" language-java"><code class="prism  language-java">
<span class="token annotation punctuation">@RequestMapping</span><span class="token punctuation">(</span>EndPointUris<span class="token punctuation">.</span> _CONTROLS_ <span class="token punctuation">)</span>
<span class="token keyword">public</span> <span class="token keyword">interface</span> <span class="token class-name">TaskControlApi</span> <span class="token punctuation">{</span>

<span class="token annotation punctuation">@PostMapping</span>
ResponseEntity<span class="token operator">&lt;</span>ControlDTO<span class="token operator">&gt;</span> <span class="token function">create</span><span class="token punctuation">(</span><span class="token annotation punctuation">@Valid</span> <span class="token annotation punctuation">@RequestBody</span> <span class="token keyword">final</span>
ControlDTO controlDTO<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token annotation punctuation">@GetMapping</span>
ResponseEntity<span class="token operator">&lt;</span>List<span class="token operator">&lt;</span>ControlDTO<span class="token operator">&gt;&gt;</span> <span class="token function">getAll</span><span class="token punctuation">(</span><span class="token keyword">final</span> ControlFilterCriteriaDTO search<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token annotation punctuation">@GetMapping</span><span class="token punctuation">(</span>EndPointUris<span class="token punctuation">.</span> _CONTROL_ <span class="token punctuation">)</span>
ResponseEntity<span class="token operator">&lt;</span>ControlDTO<span class="token operator">&gt;</span> <span class="token function">getById</span><span class="token punctuation">(</span><span class="token annotation punctuation">@PathVariable</span><span class="token punctuation">(</span>value <span class="token operator">=</span> <span class="token string">"id"</span><span class="token punctuation">)</span>
<span class="token keyword">final</span> <span class="token keyword">int</span> controlId<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token annotation punctuation">@DeleteMapping</span><span class="token punctuation">(</span>EndPointUris<span class="token punctuation">.</span> _CONTROL_ <span class="token punctuation">)</span>
ResponseEntity<span class="token operator">&lt;</span>Void<span class="token operator">&gt;</span> <span class="token function">delete</span><span class="token punctuation">(</span><span class="token annotation punctuation">@PathVariable</span><span class="token punctuation">(</span>value <span class="token operator">=</span> <span class="token string">"id"</span><span class="token punctuation">)</span> <span class="token keyword">final</span> <span class="token keyword">int</span> controlId<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token annotation punctuation">@PutMapping</span><span class="token punctuation">(</span>EndPointUris<span class="token punctuation">.</span> _CONTROL_ <span class="token punctuation">)</span>
ResponseEntity<span class="token operator">&lt;</span>ControlDTO<span class="token operator">&gt;</span> <span class="token function">update</span><span class="token punctuation">(</span><span class="token annotation punctuation">@PathVariable</span><span class="token punctuation">(</span>value <span class="token operator">=</span> <span class="token string">"id"</span><span class="token punctuation">)</span> <span class="token keyword">final</span> <span class="token keyword">int</span> controlId<span class="token punctuation">,</span> <span class="token annotation punctuation">@Valid</span> <span class="token annotation punctuation">@RequestBody</span> <span class="token keyword">final</span> ControlDTO controlDTO<span class="token punctuation">)</span><span class="token punctuation">;</span>
 <span class="token punctuation">}</span>
</code></pre>
<p>En la Interfaz TaskControlAPI, definimos los métodos que manejará nuestro servicio junto con las anotaciones pertinentes, con la intención de que se puedan abordar varias implementaciones si fuera necesario.</p>
<pre class=" language-java"><code class="prism  language-java">
<span class="token annotation punctuation">@RestController</span>
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">TaskControlController</span> <span class="token keyword">implements</span> <span class="token class-name">TaskControlApi</span> <span class="token punctuation">{</span>

<span class="token annotation punctuation">@Autowired</span>
<span class="token keyword">private</span> TaskControlService taskControlService<span class="token punctuation">;</span>

<span class="token annotation punctuation">@Override</span>
<span class="token keyword">public</span> ResponseEntity<span class="token operator">&lt;</span>ControlDTO<span class="token operator">&gt;</span> <span class="token function">create</span><span class="token punctuation">(</span><span class="token annotation punctuation">@Valid</span> ControlDTO
controlDTO<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">return</span> ResponseEntity<span class="token punctuation">.</span><span class="token function">OK</span><span class="token punctuation">(</span>taskControlService<span class="token punctuation">.</span><span class="token function">create</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>

<span class="token annotation punctuation">@Override</span>
<span class="token keyword">public</span> ResponseEntity<span class="token operator">&lt;</span>List<span class="token operator">&lt;</span>ControlDTO<span class="token operator">&gt;&gt;</span>
<span class="token function">getAll</span><span class="token punctuation">(</span>ControlFilterCriteriaDTO search<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">return</span> ResponseEntity<span class="token punctuation">.</span><span class="token function">OK</span><span class="token punctuation">(</span>taskControlService<span class="token punctuation">.</span><span class="token function">getAll</span><span class="token punctuation">(</span>search<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>

<span class="token keyword">public</span> ResponseEntity<span class="token operator">&lt;</span>ControlDTO<span class="token operator">&gt;</span> <span class="token function">getById</span><span class="token punctuation">(</span><span class="token annotation punctuation">@PathVariable</span><span class="token punctuation">(</span>value <span class="token operator">=</span>
<span class="token string">"id"</span><span class="token punctuation">)</span> <span class="token keyword">final</span> <span class="token keyword">int</span> controlId<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">return</span>
ResponseEntity<span class="token punctuation">.</span><span class="token function">OK</span><span class="token punctuation">(</span>taskControlService<span class="token punctuation">.</span><span class="token function">getById</span><span class="token punctuation">(</span>controlId<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>

<span class="token annotation punctuation">@Override</span>
<span class="token keyword">public</span> ResponseEntity<span class="token operator">&lt;</span>Void<span class="token operator">&gt;</span> <span class="token function">delete</span><span class="token punctuation">(</span><span class="token keyword">int</span> controlId<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">return</span> ResponseEntity<span class="token punctuation">.</span><span class="token function">NOCONTENT</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">build</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>

<span class="token annotation punctuation">@Override</span>
<span class="token keyword">public</span> ResponseEntity<span class="token operator">&lt;</span>ControlDTO<span class="token operator">&gt;</span> <span class="token function">update</span><span class="token punctuation">(</span><span class="token keyword">int</span> controlId<span class="token punctuation">,</span> <span class="token annotation punctuation">@Valid</span>
ControlDTO controlDTO<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">return</span> ResponseEntity<span class="token punctuation">.</span><span class="token function">OK</span><span class="token punctuation">(</span>taskControlService<span class="token punctuation">.</span><span class="token function">update</span><span class="token punctuation">(</span>controlId<span class="token punctuation">,</span> controlDTO<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<h3 id="spring-boot---api-rest-manejo-de-excepciones">Spring Boot - API Rest Manejo de Excepciones</h3>
<p>Para el control de excepciones de un servicio REST con Spring existen varias opciones.</p>
<p>Una de las más fáciles, aunque sólo puede usarse a partir de Spring 5, consiste en utilizar la excepción aportada por Spring llamada <strong>“ResponseStatusException”</strong>.</p>
<pre class=" language-java"><code class="prism  language-java">
<span class="token annotation punctuation">@GetMapping</span><span class="token punctuation">(</span>value <span class="token operator">=</span> <span class="token string">"/{id}"</span><span class="token punctuation">)</span>
<span class="token keyword">public</span> Foo <span class="token function">findById</span><span class="token punctuation">(</span><span class="token annotation punctuation">@PathVariable</span><span class="token punctuation">(</span><span class="token string">"id"</span><span class="token punctuation">)</span> Long id<span class="token punctuation">,</span> HttpServletResponse
response<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">try</span> <span class="token punctuation">{</span>
Foo resourceById <span class="token operator">=</span> RestPreconditions<span class="token punctuation">.</span><span class="token function">checkFound</span><span class="token punctuation">(</span>service<span class="token punctuation">.</span><span class="token function">findOne</span><span class="token punctuation">(</span>id<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
eventPublisher<span class="token punctuation">.</span><span class="token function">publishEvent</span><span class="token punctuation">(</span><span class="token keyword">new</span> <span class="token class-name">SingleResourceRetrievedEvent</span><span class="token punctuation">(</span><span class="token keyword">this</span><span class="token punctuation">,</span> response<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token keyword">return</span> resourceById<span class="token punctuation">;</span>
<span class="token punctuation">}</span> <span class="token keyword">catch</span> <span class="token punctuation">(</span><span class="token class-name">MyResourceNotFoundException</span> exc<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">throw</span> <span class="token keyword">new</span> <span class="token class-name">ResponseStatusException</span><span class="token punctuation">(</span> HttpStatus<span class="token punctuation">.</span>NOT_FOUND<span class="token punctuation">,</span> <span class="token string">"Foo Not Found"</span><span class="token punctuation">,</span> exc<span class="token punctuation">)</span><span class="token punctuation">;</span> <span class="token punctuation">}</span><span class="token punctuation">}</span>

</code></pre>
<p>Esta excepción la debemos lanzar en el “catch” de un bloque “try-catch” o al controlar algún comportamiento indebido en nuestra aplicación a nivel de controlador. Es útil para realizar prototipos de métodos y ver las posibles excepciones que puede lanzar un método, antes de implementar un manejador global de excepciones.</p>
<p><em>AVISO : Si se controlan las excepciones con un manejador @ControllerAdvice y además lanzando este tipo de excepción, se crean conflictos.</em></p>
<p>Otra opción, es utilizar la notación de Spring @ControllerAdvice que permite implementar manejadores globales @ExceptionHandler para distintas excepciones:</p>
<pre class=" language-java"><code class="prism  language-java">
<span class="token annotation punctuation">@ControllerAdvice</span>
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">RestResponseEntityExceptionHandler</span>
<span class="token keyword">extends</span> <span class="token class-name">ResponseEntityExceptionHandler</span> <span class="token punctuation">{</span>


<span class="token annotation punctuation">@ExceptionHandler</span><span class="token punctuation">(</span>value <span class="token operator">=</span> <span class="token punctuation">{</span> IllegalArgumentException<span class="token punctuation">.</span><span class="token keyword">class</span><span class="token punctuation">,</span> IllegalStateException<span class="token punctuation">.</span><span class="token keyword">class</span><span class="token punctuation">}</span><span class="token punctuation">)</span>
<span class="token keyword">protected</span> ResponseEntity<span class="token operator">&lt;</span>Object<span class="token operator">&gt;</span> <span class="token function">handleConflict</span><span class="token punctuation">(</span>
RuntimeException ex<span class="token punctuation">,</span> WebRequest request<span class="token punctuation">)</span> <span class="token punctuation">{</span>
String bodyOfResponse <span class="token operator">=</span> <span class="token string">"This should be application specific"</span><span class="token punctuation">;</span>
<span class="token keyword">return</span> <span class="token function">handleExceptionInternal</span><span class="token punctuation">(</span>ex<span class="token punctuation">,</span> bodyOfResponse<span class="token punctuation">,</span> <span class="token keyword">new</span> <span class="token class-name">HttpHeaders</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">,</span> HttpStatus<span class="token punctuation">.</span>CONFLICT<span class="token punctuation">,</span> request<span class="token punctuation">)</span><span class="token punctuation">;</span>

<span class="token punctuation">}</span>

<span class="token punctuation">}</span>
</code></pre>
<p>Está pensado para ser utilizado a nivel de controlador de nuestro servicio rest, ya que hace uso de los objetos de tipo ResponseEntity.</p>
<p><em>AVISO : Si no se especifica una excepción para ser controlada en la anotación<br>
“@ExceptionHandler(value= {…AQUÍ…})” se producirá un error indicando que no se ha encontrado manejador definido para esa excepción.</em></p>
<p>Por último, se suele utilizar una combinación de dos métodos que consiste en la creación de excepciones propias las cuales no será necesario que lancen a través de la anotación “@ResponseStatus(value = HttpStatus.ERROR_TYPE)” un error de tipo HTTP como respuesta, ya que de eso se encargará el manejador global. Dicho manejardor controlará estas excepciones como un error REST y dará una respuesta a través de los ResponseEntity que le indiquemos (con archivos HTML estáticos por ejemplo).</p>
<p>Por lo tanto, debemos crear una clase controladora y utilizar la anotación @RestControllerAdvice par definir un manejador de excepciones global que controle estas excepciones.</p>
<hr>
<h3 id="modelo-1">Modelo</h3>
<p>Se sigue el patrón usual para los modelos de las aplicaciones web. Se distinguen dos tipos de objetos<br>
diferenciados, que son los Value Objects y los Data Transfer Objects:</p>
<p>VO (Value Object) → Son los datos que se pueden o se encuentran persistidos en la BD. Es decir, son<br>
el tipo de datos que se intercambian con la base de datos y que quizás requieran tener ciertas<br>
propiedades específicas para su manejo en la base de datos. Además, en el contexto de Spring,<br>
existen ciertas anotaciones que pertenecen al módulo de Spring Boot, llamado Spring Data, y que<br>
permiten configurar de forma sencilla este tipo de objetos.</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token annotation punctuation">@Getter</span>
<span class="token annotation punctuation">@Setter</span>
<span class="token annotation punctuation">@AllArgsConstructor</span>
<span class="token annotation punctuation">@NoArgsConstructor</span>
<span class="token annotation punctuation">@Builder</span>
<span class="token annotation punctuation">@Entity</span>
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">ControlVO</span> <span class="token punctuation">{</span>

<span class="token annotation punctuation">@GeneratedValue</span>
<span class="token annotation punctuation">@Id</span>
<span class="token keyword">private</span> Integer id<span class="token punctuation">;</span>
<span class="token keyword">private</span> String task_reference<span class="token punctuation">;</span>
<span class="token keyword">private</span> String alum_reference<span class="token punctuation">;</span>
<span class="token keyword">private</span> Date controlDate<span class="token punctuation">;</span>
<span class="token keyword">private</span> Integer workDoneQuantityValuation<span class="token punctuation">;</span>
<span class="token keyword">private</span> String workDoneQuantityComment<span class="token punctuation">;</span>
<span class="token keyword">private</span> Integer workLoadValuation<span class="token punctuation">;</span>
<span class="token keyword">private</span> String workLoadComment<span class="token punctuation">;</span>
<span class="token keyword">private</span> Integer difficultValuation<span class="token punctuation">;</span>
<span class="token keyword">private</span> String difficultComment<span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre>
<ul>
<li>DTO (Data Transfer Object):  Son la representación de los datos que se manejan en la aplicación para ser transferidos o recibidos como recursos en las peticiones realizadas hacia la aplicación. Solo son utilizados en el intercambio de datos en las peticiones web.</li>
</ul>
<pre class=" language-java"><code class="prism  language-java">
<span class="token annotation punctuation">@Getter</span>
<span class="token annotation punctuation">@Setter</span>
<span class="token annotation punctuation">@AllArgsConstructor</span>
<span class="token annotation punctuation">@NoArgsConstructor</span>
<span class="token annotation punctuation">@Builder</span>
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">ControlDTO</span> <span class="token punctuation">{</span>
<span class="token keyword">private</span> Integer id<span class="token punctuation">;</span>
<span class="token keyword">private</span> String task_reference<span class="token punctuation">;</span>
<span class="token keyword">private</span> String alum_reference<span class="token punctuation">;</span>
<span class="token annotation punctuation">@DateTimeFormat</span><span class="token punctuation">(</span>pattern <span class="token operator">=</span> <span class="token string">"yyyy-MM-dd'T'HH:mm:ss.SSSXXX"</span><span class="token punctuation">)</span>
<span class="token keyword">private</span> Date controlDate<span class="token punctuation">;</span>
<span class="token annotation punctuation">@NotNull</span><span class="token punctuation">(</span>message <span class="token operator">=</span> "The evaluation <span class="token keyword">for</span> the quantity of the work
done can't be null<span class="token operator">!</span>"<span class="token punctuation">)</span>
<span class="token keyword">private</span> Integer workDoneQuantityValuation<span class="token punctuation">;</span>
<span class="token annotation punctuation">@NotBlank</span><span class="token punctuation">(</span>message <span class="token operator">=</span> "The comment <span class="token keyword">for</span> the quantity of the work
done can't be null<span class="token operator">!</span>"<span class="token punctuation">)</span>
<span class="token keyword">private</span> String workDoneQuantityComment<span class="token punctuation">;</span>
<span class="token annotation punctuation">@NotNull</span><span class="token punctuation">(</span>message <span class="token operator">=</span> "The evaluation <span class="token keyword">for</span> the workload can't be
null<span class="token operator">!</span>"<span class="token punctuation">)</span>
<span class="token keyword">private</span> Integer workLoadValuation<span class="token punctuation">;</span>
<span class="token annotation punctuation">@NotBlank</span><span class="token punctuation">(</span>message <span class="token operator">=</span> "The comment <span class="token keyword">for</span> the workload can't be
null<span class="token operator">!</span>"<span class="token punctuation">)</span>
<span class="token keyword">private</span> String workLoadComment<span class="token punctuation">;</span>
<span class="token annotation punctuation">@NotNull</span><span class="token punctuation">(</span>message <span class="token operator">=</span> "The evaluation <span class="token keyword">for</span> the difficult can't be
null<span class="token operator">!</span>"<span class="token punctuation">)</span>
<span class="token keyword">private</span> Integer difficultValuation<span class="token punctuation">;</span>
<span class="token annotation punctuation">@NotBlank</span><span class="token punctuation">(</span>message <span class="token operator">=</span> "The comment <span class="token keyword">for</span> the difficult can't be
null<span class="token operator">!</span>"<span class="token punctuation">)</span>
<span class="token keyword">private</span> String difficultComment<span class="token punctuation">;</span>
<span class="token punctuation">}</span>

</code></pre>
<img src="https://i.imgur.com/Z4Epg6Y.png">
<p>Para la creación de las clases de objetos POJO que definen nuestros objetos, se ha utilizado la herramienta LOMBOK. Lombok consiste en una librería para Java que nos ofrece, a través de anotaciones, reducir el código de las clases POJO de nuestra aplicación.</p>
<p>Para poder usar esta librería, ha de definirse como dependencia en el archivo POM.xml de la aplicación:</p>
<pre class=" language-xml"><code class="prism  language-xml">
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.projectlombok<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>lombok<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>optional</span><span class="token punctuation">&gt;</span></span>true<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>optional</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<p>Además, generalmente, será necesario activar el procesador de anotaciones del IDE, así como, a veces, instalar un plugin que procese estas anotaciones:</p>
<img src="https://i.imgur.com/T34OUka.png">
<img src="https://i.imgur.com/gbukY3x.png">
<p>Las anotaciones le indican a Lombok qué métodos debe generar escaneando los atributos de la clase donde haya sido utilizado en tiempo de compilación. Las anotaciones más importantes son:</p>
<ul>
<li><strong>@Getter</strong> Genera los métodos “get” para los atributos definidos.</li>
<li><strong>@Setter</strong>: Genera los métodos “set”</li>
<li><strong>@AllArgsConstructor</strong>: Genera un constructor con todos los atributos como argumentos</li>
<li><strong>@NoArgsConstructor</strong>: Genera un constructor sin argumentos</li>
<li><strong>@Builder</strong>: Permite utilizar el patrón “builder” para crear nuevos objetos, como por ejemplo:</li>
</ul>
<pre class=" language-java"><code class="prism  language-java">ControlVO<span class="token punctuation">.</span><span class="token function">builder</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">alum_reference</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getAlum_reference</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">controlDate</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getControlDate</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">difficultComment</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getDifficultComment</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">difficultValuation</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getDifficultValuation</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">id</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getId</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">task_reference</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getTask_reference</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">workLoadComment</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getWorkLoadComment</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">workLoadValuation</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getWorkLoadValuation</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">build</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre>
<p>Generalmente, los datos se intercambian con formato “JSON” o “XML” entre otros. Luego, estos datos son manejados por el controlador de la API y son traducidos al contexto del lenguaje orientado a objetos.</p>
<pre class=" language-yml"><code class="prism  language-yml"><span class="token punctuation">{</span>
<span class="token key atrule">"alum_reference"</span><span class="token punctuation">:</span> <span class="token string">"string"</span><span class="token punctuation">,</span>
<span class="token key atrule">"controlDate"</span><span class="token punctuation">:</span> <span class="token string">"2019- 06 - 10T18:19:51.802Z"</span><span class="token punctuation">,</span>
<span class="token key atrule">"difficultComment"</span><span class="token punctuation">:</span> <span class="token string">"string"</span><span class="token punctuation">,</span>
<span class="token key atrule">"difficultValuation"</span><span class="token punctuation">:</span> <span class="token number">0</span><span class="token punctuation">,</span>
<span class="token key atrule">"id"</span><span class="token punctuation">:</span> <span class="token number">0</span><span class="token punctuation">,</span>


<span class="token key atrule">"task_reference"</span><span class="token punctuation">:</span> <span class="token string">"string"</span><span class="token punctuation">,</span>
<span class="token key atrule">"workDoneQuantityComment"</span><span class="token punctuation">:</span> <span class="token string">"string"</span><span class="token punctuation">,</span>
<span class="token key atrule">"workDoneQuantityValuation"</span><span class="token punctuation">:</span> <span class="token number">0</span><span class="token punctuation">,</span>
<span class="token key atrule">"workLoadComment"</span><span class="token punctuation">:</span> <span class="token string">"string"</span><span class="token punctuation">,</span>
<span class="token key atrule">"workLoadValuation"</span><span class="token punctuation">:</span> <span class="token number">0</span>
<span class="token punctuation">}</span>
</code></pre>
<p>Más tarde, interiormente, los servicios encargados manejar las peticiones llegadas al controlador del API, transforman y manejan esos objetos según las necesidades de la aplicación.</p>
<p>Por ello, la traducción de los datos de DTO a VO se ha de realizar en la capa de Servicio de nuestra aplicación. Esta recibirá los DTOs del controlador y guardará los objetos VO a través de la capa de datos o repositorio.</p>
<p>En nuestra aplicación, se ha seguido este patrón para la conversión y mapeo de datos entre objetos DTO y objetos VO o entidad. Uno de estos convertidores podemos verlo en el siguiente ejemplo:</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token annotation punctuation">@Component</span>
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">ControlConverter</span> <span class="token punctuation">{</span>

<span class="token keyword">public</span> ControlDTO <span class="token function">convertEntityToDTO</span><span class="token punctuation">(</span>ControlVO controlVO<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">return</span>
ControlDTO<span class="token punctuation">.</span><span class="token function">builder</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">alum_reference</span><span class="token punctuation">(</span>controlVO<span class="token punctuation">.</span><span class="token function">getAlum_reference</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">controlDate</span><span class="token punctuation">(</span>controlVO<span class="token punctuation">.</span><span class="token function">getControlDate</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">difficultComment</span><span class="token punctuation">(</span>controlVO<span class="token punctuation">.</span>
<span class="token function">getDifficultComment</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">difficultValuation</span><span class="token punctuation">(</span>controlVO<span class="token punctuation">.</span><span class="token function">getDifficultValuation</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">id</span><span class="token punctuation">(</span>controlVO<span class="token punctuation">.</span>
<span class="token function">getId</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">task_reference</span><span class="token punctuation">(</span>controlVO<span class="token punctuation">.</span><span class="token function">getTask_reference</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">workLoadComment</span><span class="token punctuation">(</span>contr
olVO<span class="token punctuation">.</span><span class="token function">getWorkLoadComment</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">workLoadValuation</span><span class="token punctuation">(</span>controlVO<span class="token punctuation">.</span><span class="token function">getWorkLoadValuation</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">build</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>

<span class="token keyword">public</span> ControlVO <span class="token function">convertDTOToEntity</span><span class="token punctuation">(</span>ControlDTO controlDTO<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">return</span>
ControlVO<span class="token punctuation">.</span><span class="token function">builder</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">alum_reference</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getAlum_reference</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">controlDate</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getControlDate</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">difficultComment</span><span class="token punctuation">(</span>controlDT
O<span class="token punctuation">.</span><span class="token function">getDifficultComment</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">difficultValuation</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getDifficultValuation</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">id</span><span class="token punctuation">(</span>controlDT
O<span class="token punctuation">.</span><span class="token function">getId</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">task_reference</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getTask_reference</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">workLoadComment</span><span class="token punctuation">(</span>cont
rolDTO<span class="token punctuation">.</span><span class="token function">getWorkLoadComment</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span>
<span class="token punctuation">.</span><span class="token function">workLoadValuation</span><span class="token punctuation">(</span>controlDTO<span class="token punctuation">.</span><span class="token function">getWorkLoadValuation</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">build</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
 <span class="token punctuation">}</span>
</code></pre>
<hr>
<h3 id="spring-data---mongodb">Spring Data - MongoDB</h3>
<p>Como ya se ha comentado anteriormente, Spring Framework proporciona una potente interfaz para el manejo de datos con las principales tecnologías de base de datos. Estas interfaces se aúnan bajo el módulo de Spring-Data, el cual se subdivide en distintas librerías de las que el desarrollador dispone.</p>
<p>Para MongoDB, Spring Data tiene dos formas de abordar esta estructura de datos. Una es utilizando su implementación a través de la interfaz MongoRepository. Y la otra es utilizando el java-bean MongoTemplate, el cual ofrece una implementación totalmente configurable por el desarrollador a través de código o XML.</p>
<p>Para el uso de MongoRepository tan solo es necesario crear una interfaz que extienda de esta clase:</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token annotation punctuation">@Repository</span>
<span class="token keyword">public</span> <span class="token keyword">interface</span> <span class="token class-name">TaskRepository</span> <span class="token keyword">extends</span> <span class="token class-name">MongoRepository</span><span class="token operator">&lt;</span>TaskVO<span class="token punctuation">,</span>
String<span class="token operator">&gt;</span><span class="token punctuation">,</span> CustomTaskRepository <span class="token punctuation">{</span>
<span class="token punctuation">}</span>
</code></pre>
<p>Spring Data MongoRepository nos ofrece la posibilidad de definir métodos en la interfaz que hemos creado que extiende al repository, que Spring mapeará como queries de mongo.</p>
<p>Por otro lado, MongoTemplate nos permite realizar un abordamiento más clásico para la creación de un repositorio. En este caso, tendremos la posibilidad utilizar un java-bean llamado MongoTemplate el cual nos es ofrecido por Spring Data y el cual es cargado en el contexto de Spring.</p>
<p>Esta interfaz nos permite implementar los métodos que nos sean necesarios, creando queries propias y funciones complejas para el manejo de datos con mongo.</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">public</span> <span class="token keyword">interface</span> <span class="token class-name">CustomTaskRepository</span> <span class="token punctuation">{</span>
List<span class="token operator">&lt;</span>TaskVO<span class="token operator">&gt;</span> <span class="token function">findAllFilteredByQuery</span><span class="token punctuation">(</span><span class="token keyword">final</span> Query query<span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">CustomTaskRepositoryImpl</span> <span class="token keyword">implements</span>
<span class="token class-name">CustomTaskRepository</span> <span class="token punctuation">{</span>
<span class="token annotation punctuation">@Autowired</span>
<span class="token keyword">private</span> MongoTemplate mongoTemplate<span class="token punctuation">;</span>
<span class="token annotation punctuation">@Override</span>
<span class="token keyword">public</span> List<span class="token operator">&lt;</span>TaskVO<span class="token operator">&gt;</span> <span class="token function">findAllFilteredByQuery</span><span class="token punctuation">(</span><span class="token keyword">final</span> Query query<span class="token punctuation">)</span> <span class="token punctuation">{</span>
<span class="token keyword">return</span> mongoTemplate<span class="token punctuation">.</span><span class="token function">find</span><span class="token punctuation">(</span>query<span class="token punctuation">,</span> TaskVO<span class="token punctuation">.</span><span class="token keyword">class</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<p>En el caso de necesitar ambas implementaciones, es necesario crear una interfaz que extienda de MongoRepository y al mismo tiempo realizar una implementación propia de algunos métodos utilizando el java-bean MongoTemplate, como se puede ver en el ejemplo anterior.</p>
<hr>
<h3 id="spring-data---postgresql">Spring Data - PostgreSQL</h3>
<p>Se crea una clase Interfaz que extienda a “JPARepository&lt;R,T&gt;” donde “R” es el tipo Java de la ID y “T” el tipo de los objetos que se van a guardar. La implementación de JPA hace uso de algunos ORMs como Hibernate.</p>
<ul>
<li><strong>@Entity</strong>: Señala que esta clase es un objeto que se puede persistir en la estructura de datos.</li>
<li><strong>@Id</strong>: Señaliza que será la ID del objeto a persistir</li>
<li><strong>@GeneratedValue</strong>: Genera automáticamente la id cuando un objeto se persiste</li>
</ul>
<p>Para las relaciones Uno a Muchos unidireccionales, la estructura básica de anotación es:</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token annotation punctuation">@OneToMany</span><span class="token punctuation">(</span>cascade <span class="token operator">=</span> CascadeType<span class="token punctuation">.</span> ALL <span class="token punctuation">,</span> orphanRemoval <span class="token operator">=</span> <span class="token boolean">true</span><span class="token punctuation">)</span>
<span class="token annotation punctuation">@JoinColumn</span><span class="token punctuation">(</span>name <span class="token operator">=</span> <span class="token string">"employee"</span><span class="token punctuation">)</span>
<span class="token keyword">private</span> List<span class="token operator">&lt;</span>WorkExperienceVO<span class="token operator">&gt;</span> workExperiences<span class="token punctuation">;</span>
</code></pre>
<p>Donde “@OneToMany” señala qué tipo de relación es, el “cascadeType” hace referencia a la forma de comportarse la “cascada” de acciones de los datos. Es decir, si se borra un objeto de la lista de objetos referenciados también se borrará su persistencia y etc. En este caso, “ALL” hace referencia a que están todos los modos activados.</p>
<p>El atributo “orphanRemoval” indica si se desea que cuando se borre un objeto padre persistido, también se borren todos sus hijos.</p>
<hr>
<h3 id="service-discovery-1">Service Discovery</h3>
<p>El Service Discovery es un proyecto en sí mismo basado en Spring Boot y Spring Cloud. Lo que hace es resolver las peticiones a los servicios de una aplicación compuesta por microservicios. Esto quiere decir, que es el encargado de llamar a las direcciones (endpoints o uris) de cada servicio.</p>
<p>Dicho de otra forma, será el que tenga la “libreta de direcciones” de los demás servicios que componen la aplicación. Es el encargado de buscar a qué dirección corresponde el servicio que se está tratando de consumir y ofrecer dicho servicio a la petición tras ser recibida.</p>
<p>En Spring, se utilizan las librerías de Spring Cloud, concretamente, éstas se llaman Eureka. Estas librerías te ofrecen las funcionalidades para la implementación de un Service Discovery bastante completo para una aplicación basada en arquitectura de microservicios e implementada con Spring.</p>
<p>Para ello, ha de crearse un proyecto Spring que tenga las dependencias de Spring Cloud dentro.<br>
Además, en el main de la aplicación Spring Boot, ha de aparecer la siguiente anotación:</p>
<ul>
<li><strong>@EnableEurekaServer</strong></li>
</ul>
<p>En cuanto al archivo properties de la aplicación, ha de tener una forma similar a: server.port= 8761</p>
<pre class=" language-properties"><code class="prism  language-properties"><span class="token attr-name">eureka.client.register-with-eureka</span><span class="token punctuation">=</span><span class="token attr-value">false</span>
<span class="token attr-name">eureka.client.fetch-registry</span><span class="token punctuation">=</span><span class="token attr-value">false</span>
</code></pre>
<p>Esto nos permitirá acceder a una consola de información sobre el Service Discovery, con información sobre los servicios a los que hace referencia y a la máquina en la que está corriendo.</p>
<p>De otra forma, también puede utilizarse la configuración en formato “.yml”, la cual es más limpia y más legible. Entre estas propiedades que se definen, se pueden configurar elementos del tipo:</p>
<pre class=" language-yml"><code class="prism  language-yml"><span class="token key atrule">server</span><span class="token punctuation">:</span>
<span class="token key atrule">port</span><span class="token punctuation">:</span> $<span class="token punctuation">{</span>PORT<span class="token punctuation">:</span><span class="token number">8761</span><span class="token punctuation">}</span>
</code></pre>
<p>Donde la notación con el dólar, indica el uso de una variable global ya definida. En este caso, con la notación <strong>“DEFAULT:new”</strong>, se está indicando que primeramente se buscará la variable definida por defecto “PORT” para la propiedad server. En caso de no existir, los dos puntos indicar un operador<br>
lógico “OR” que indica qué puerto ha de usarse en caso de no existir uno por defecto ya definido. Esto nos sirve para parametrizar la configuración de nuestra aplicación.</p>
<hr>
<h3 id="spring-cloud-gateway">Spring Cloud Gateway:</h3>
<p>El Gateway es un servicio basado en Spring Boot y Spring Cloud. Resumidamente, se encarga de resolver las peticiones realizadas a la aplicación de forma centralizada y distribuirla entra los servicios de una aplicación compuesta por microservicios.</p>
<p>Esto quiere decir, que es el encargado de recibir y organizar las peticiones hacia los distintos recursos entre los distintos servicios.</p>
<p>El Gateway, como su nombre indica, hace de “portero” en la conexión entre las peticiones externas y los microservicios que componen nuestra aplicación.</p>
<p>Para la implementación del Gateway, como para otros servicios ya creados, primero se ha generado un proyecto inicializado desde la web spring-initializr. En este caso, es necesario añadir las dependencias referentes a la librería spring cloud y el artefacto gateway:</p>
<pre class=" language-xml"><code class="prism  language-xml"><span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.cloud<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>


<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-cloud-starter-gateway<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.cloud<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-cloud-starter-config<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<p>A estas dependencias, debemos sumarles las nombradas anteriormente para que nuestro servicio<br>
solicite su configuración al servidor config de forma ordenada y, además, que se registre en nuestro<br>
service discovery.</p>
<p>En esta ocasión, a configuración del servicio deberá ser algo más exhaustiva, ya que es necesario que<br>
le especifiquemos los servicios a los que debe redirigir de forma automática las peticiones que se le<br>
realicen a través de su URI.</p>
<p>Para nuestro caso, se han implementado dos configuraciones correspondientes a los perfiles Spring<br>
declarados, en nuestro caso, local y develop.</p>
<p>Para el caso del perfil local:</p>
<ul>
<li><strong>bootstrap-local.yml →</strong></li>
</ul>
<pre class=" language-yml"><code class="prism  language-yml"><span class="token key atrule">spring</span><span class="token punctuation">:</span>
<span class="token key atrule">application</span><span class="token punctuation">:</span>
<span class="token key atrule">name</span><span class="token punctuation">:</span> gateway
<span class="token key atrule">cloud</span><span class="token punctuation">:</span>
<span class="token key atrule">config</span><span class="token punctuation">:</span>
<span class="token key atrule">enabled</span><span class="token punctuation">:</span> <span class="token boolean important">false</span>
<span class="token key atrule">eureka</span><span class="token punctuation">:</span>
<span class="token key atrule">client</span><span class="token punctuation">:</span>
<span class="token key atrule">enabled</span><span class="token punctuation">:</span> <span class="token boolean important">false</span>
</code></pre>
<hr>
<ul>
<li><strong>application-local.yml →</strong></li>
</ul>
<pre class=" language-yml"><code class="prism  language-yml"><span class="token key atrule">spring</span><span class="token punctuation">:</span>
<span class="token key atrule">cloud</span><span class="token punctuation">:</span>
<span class="token key atrule">gateway</span><span class="token punctuation">:</span>
<span class="token key atrule">routes</span><span class="token punctuation">:</span>

<span class="token punctuation">-</span> <span class="token key atrule">id</span><span class="token punctuation">:</span> task<span class="token punctuation">-</span>calendar<span class="token punctuation">-</span>service _<span class="token comment">#Order service route declaration_</span>
<span class="token key atrule">uri</span><span class="token punctuation">:</span> <span class="token string">"http://localhost:8095"</span>
<span class="token key atrule">predicates</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> Path=/calendar/** _<span class="token comment">#Path to access the service_</span>
<span class="token key atrule">filters</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> StripPrefix=1
<span class="token punctuation">-</span> <span class="token key atrule">id</span><span class="token punctuation">:</span> task<span class="token punctuation">-</span>control<span class="token punctuation">-</span>service _<span class="token comment">#Task-Control service route</span>
declaration_

<span class="token key atrule">uri</span><span class="token punctuation">:</span> <span class="token string">"http://localhost:8098"</span>
<span class="token key atrule">predicates</span><span class="token punctuation">:</span>

<span class="token punctuation">-</span> Path=/task<span class="token punctuation">-</span>control/** _<span class="token comment">#Path to access the service_</span>
<span class="token key atrule">filters</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> StripPrefix=1
</code></pre>
<p>En este caso, la configuración inicial, o “bootstrap”, nos indica que no se desea que el servicio<br>
busque su configuración en el servidor y que, además, no se registre en el servidor Eureka. Esto se<br>
debe a que, en un entorno local, quizás no es deseable levantar todos los servicios, y solo es<br>
necesario ejecutar los servicios individualmente para probar su funcionamiento.</p>
<p>Junto a esta configuración inicial, se encuentra la configuración principal de la aplicación, en la que,<br>
en este caso, se declaran las rutas que nuestro servicio ha de redirigir junto con los predicados a los<br>
que el usuario tendrá acceso.</p>
<hr>
<h3 id="spring-cloud-config-server">Spring Cloud Config Server</h3>
<p>Spring, ofrece una implementación del llamado Config Server muy útil y sencilla. En nuestro caso, se ha creado un proyecto con la herramienta antes mencionada “spring-initializr”, con las dependencias correspondientes a Spring Cloud, que es la librería padre que nos ofrece Spring Cloud Config Server:</p>
<pre class=" language-xml"><code class="prism  language-xml"><span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>properties</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>java.version</span><span class="token punctuation">&gt;</span></span>1.8<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>java.version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>spring-cloud.version</span><span class="token punctuation">&gt;</span></span>Greenwich.SR1<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>spring-cloud.version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>properties</span><span class="token punctuation">&gt;</span></span>

<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependencies</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.cloud<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-cloud-config-server<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependencies</span><span class="token punctuation">&gt;</span></span>

<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependencyManagement</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependencies</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.cloud<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-cloud-dependencies<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>${spring-cloud.version}<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>type</span><span class="token punctuation">&gt;</span></span>pom<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>type</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>scope</span><span class="token punctuation">&gt;</span></span>import<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>scope</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependencies</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependencyManagement</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<p>Una vez hecho esto, tendremos un proyecto sencillo con una clase main que se ejecutará el contexto de spring. A esta clase, habrá que añadirle obligatoriamente la siguiente anotación:</p>
<ul>
<li><strong>@EnableConfigServer</strong></li>
</ul>
<p>Además, para este servicio es necesario que implementemos una configuración concreta en el archivo “application.yml”, que debe ser la siguiente:</p>
<pre class=" language-yml"><code class="prism  language-yml"><span class="token key atrule">server</span><span class="token punctuation">:</span>
<span class="token key atrule">port</span><span class="token punctuation">:</span> <span class="token number">8888</span>

<span class="token key atrule">spring</span><span class="token punctuation">:</span>
<span class="token key atrule">application</span><span class="token punctuation">:</span>
<span class="token key atrule">name</span><span class="token punctuation">:</span> server<span class="token punctuation">-</span>config
<span class="token key atrule">cloud</span><span class="token punctuation">:</span>
<span class="token key atrule">config</span><span class="token punctuation">:</span>
<span class="token key atrule">server</span><span class="token punctuation">:</span>
<span class="token key atrule">git</span><span class="token punctuation">:</span>
<span class="token key atrule">uri</span><span class="token punctuation">:</span> https<span class="token punctuation">:</span>//gitlab.com/task<span class="token punctuation">-</span>control<span class="token punctuation">-</span>app<span class="token punctuation">-</span>config/config<span class="token punctuation">-</span>
repo.git
<span class="token key atrule">force-pull</span><span class="token punctuation">:</span> <span class="token boolean important">true</span>
<span class="token key atrule">clone-on-start</span><span class="token punctuation">:</span> <span class="token boolean important">true</span>
<span class="token key atrule">default-label</span><span class="token punctuation">:</span> master

<span class="token key atrule">repos</span><span class="token punctuation">:</span>

<span class="token key atrule">develop</span><span class="token punctuation">:</span>
<span class="token key atrule">uri</span><span class="token punctuation">:</span> https<span class="token punctuation">:</span>//gitlab.com/task<span class="token punctuation">-</span>control<span class="token punctuation">-</span>app<span class="token punctuation">-</span>
config/config<span class="token punctuation">-</span>repo.git
<span class="token key atrule">force-pull</span><span class="token punctuation">:</span> <span class="token boolean important">true</span>
<span class="token key atrule">clone-on-start</span><span class="token punctuation">:</span> <span class="token boolean important">true</span>
<span class="token key atrule">default-label</span><span class="token punctuation">:</span> develop

<span class="token key atrule">local</span><span class="token punctuation">:</span>
<span class="token key atrule">uri</span><span class="token punctuation">:</span> https<span class="token punctuation">:</span>//gitlab.com/task<span class="token punctuation">-</span>control<span class="token punctuation">-</span>app<span class="token punctuation">-</span>
config/config<span class="token punctuation">-</span>repo.git
<span class="token key atrule">force-pull</span><span class="token punctuation">:</span> <span class="token boolean important">true</span>
<span class="token key atrule">clone-on-start</span><span class="token punctuation">:</span> <span class="token boolean important">true</span>
<span class="token key atrule">default-label</span><span class="token punctuation">:</span> local
</code></pre>
<p>Donde podremos definir distintos repositorios asociados a los perfiles de la aplicación spring. Por ejemplo, en nuestro caso, se han definido dos repositorios, que corresponden a dos perfiles definidos: local y develop.</p>
<p>En el caso del repositorio local, la configuración se establece para un entorno de pruebas local en el que se pretende desplegar todos los servicios de forma local. Por otro lado, en el perfil develop, tenemos un repositorio en el que se encontrará la configuración para el despliegue en un entorno más avanzado posiblemente en remoto.</p>
<p>Para que cada servicio pueda encontrar su archivo de configuración, estos archivos deben de tener como nombre, el nombre del servicio y extensión “.yml” o “.properties”.</p>
<p>En nuestro caso, se ha creado un repositorio GIT donde se contienen todos estos archivos:</p>
<img src="https://i.imgur.com/jvTVj3Q.png">
<p>Para que el resto de los servicios puedan encontrar su configuración apuntando a este servicio, también han de tener una configuración previa a su ejecución, en la que se definirán ciertos aspectos como el puerto o la dirección donde se encuentra el servicio, que no se encuentra registrado en el Service Discovery ya que es un servicio extra y totalmente independiente, y el nombre con el que buscará su configuración en el repositorio.</p>
<p>Por ejemplo, en el caso del servicio Gateway, tendremos una configuración en el archivo “bootstrap.yml” de la siguiente forma:</p>
<pre class=" language-yml"><code class="prism  language-yml"><span class="token key atrule">spring</span><span class="token punctuation">:</span>
<span class="token key atrule">application</span><span class="token punctuation">:</span>
<span class="token key atrule">name</span><span class="token punctuation">:</span> gateway
<span class="token key atrule">cloud</span><span class="token punctuation">:</span>
<span class="token key atrule">config</span><span class="token punctuation">:</span>
<span class="token key atrule">name</span><span class="token punctuation">:</span> gateway
<span class="token key atrule">retry</span><span class="token punctuation">:</span>
<span class="token key atrule">max-attempts</span><span class="token punctuation">:</span> <span class="token number">10</span>
<span class="token key atrule">initial-interval</span><span class="token punctuation">:</span> <span class="token number">5000</span>
<span class="token key atrule">fail-fast</span><span class="token punctuation">:</span> <span class="token boolean important">true</span>
</code></pre>
<p>Con esta configuración, estamos definiendo el nombre del servicio, junto con una configuración mínima para la política de reintentos en caso de no encontrar el servicio en la dirección determinada<br>
al inicio de la aplicación. Por defecto el puerto en el que el servicio buscará el servidor de configuración es el “8888”.</p>
<p>Además, será necesario que el servicio que desee obtener su configuración del servidor tenga varias dependencias necesarias, como son:</p>
<pre class=" language-xml"><code class="prism  language-xml"><span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.cloud<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-cloud-starter-config<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.retry<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-retry<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.springframework.boot<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>spring-boot-starter-aop<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<h2 id="despliegue">Despliegue</h2>
<h3 id="docker---creación-y-ejecución-de-imágenes">Docker - Creación y ejecución de imágenes</h3>
<p>Para la creación de las imágenes Docker de los servicios que se han desarrollado, se ha investigado la herramienta desarrollada para maven llamada fabric8 plugin. Esta herramienta se encarga de la generación automática de la imagen Docker configurada a través de los archivos POM de cada servicio.</p>
<p>Previamente es necesario instalar la aplicación Docker desktop , o lo que es lo mismo, la aplicación de escritorio de Docker. Se puede accedes a su descarga a través del siguiente enlace <a href="https://www.docker.com/get-started">https://www.docker.com/get-started</a>, y aunque su uso es gratuito, será necesario que nos registremos para poder descargarlo.</p>
<p>Una vez instalado Docker, solo será necesario instalarlo para poder empezar a utilizarlo y, además, deberemos logearnos para poder descargar imágenes Docker y utilizarlas en tu propósito.</p>
<img src="https://i.imgur.com/NDMw6Cl.png">
<p>Se ha de colocar una configuración básica en el POM del proyecto para definir el plugin de fabric8 en<br>
maven.</p>
<pre class=" language-xml"><code class="prism  language-xml"><span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>build</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>plugins</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>io.fabric8<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>fabric8-maven-plugin<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>3.5.41<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>plugin</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>plugins</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>build</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<p>Una vez hecho esto, con una configuración mínima sería suficiente, y podremos hacer la generación de la imagen Docker de nuestro proyecto.</p>
<p>Primero, es necesario ejecutar el comando <strong>“mvn clean install”</strong> para instalar la librería, o nuestro proyecto compilado, en el repositorio maven local.</p>
<p>Por otro lado, para generar la imagen docker se utiliza en la línea de comandos de <strong>"mvn fabric8:build”</strong>. Para esto no es necesaria ninguna configuración previa, pero, el plugin tiene internamente dos “modos” de generación para la imagen: uno pensado en Kubernetes y otro en OpenShift.</p>
<p>En el caso de Kubernetes, se trata de un modo “simple” en el que se crea una imagen Docker típica. Aunque se puede configurar el modo de generación manualmente, para crear una imagen normal de Docker no es necesario.</p>
<p>En el caso por defecto, el plugin consulta su API automáticamente la cual indica en cada caso qué configuración es la recomendada. Casi siempre, por defecto, es el modo “Kubernetes” el cual genera una imagen Docket genérica.</p>
<p>Generalmente, para la creación de las imágenes, la configuración previa se define en el POM cuando se define el plugin de fabric. Aunque también existe la opción de incluir, manualmente los archivos o archivo DockerFile, para lo cual se le deben indicar la/las rutas.</p>
<p>Comandos Importantes:</p>
<ul>
<li>
<p><strong>docker images</strong> → Muestra todas las imágenes conocidas</p>
</li>
<li>
<p><strong>docker ps</strong> → Muestra todos los contenedores en ejecución</p>
</li>
<li>
<p><strong>docker run -p PORT:PORT image_name</strong> → Ejecuta una imagen Docker dentro de un contenedor<br>
creado según las especificaciones de la imagen en sí misma.</p>
</li>
<li>
<p><strong>docker stop &lt;CONTAINER_ID&gt;</strong> → Para la ejecución del contenedor con la ID introducida</p>
</li>
</ul>
<p>Existen otras formas de generar una imagen Docker, como por ejemplo, definiendo un DockerFile y generando la imagen a través de Docker, o lo que es lo mismo, manualmente.</p>
<p>Existen otras formas y herramientas, como es el caso de la herramienta o plugin desarrollada por Spotify la cual permite, de forma sencilla, generar una imagen Docker con una configuración sencilla.</p>
<p>Aun así, en este caso, se utiliza el plugin fabric8 ya que además de generar la imagen Docker, permite desplegar o subir la misma directamente a Kubernetes u a Openshift además de estar orientado a microservicios y otras tecnologías muy actualizadas. Esto que implica que su configuración avanzada sea algo más tediosa, aunque con un mayor abanico de posibilidades.</p>
<hr>
<h3 id="compilación-y-ejecución-del-proyecto-a-través-de-maven">Compilación y ejecución del proyecto a través de Maven</h3>
<p>En resumen, para la compilación y ejecución de los servicios de forma individual a través de Maven,<br>
necesitaremos ejecutar los siguientes pasos:</p>
<p>Primero, ejecutaremos el comando <strong>mvn clean install</strong></p>
<p>Luego, una vez se haya realizado la compilación de forma correcta y sin errores, podremos ejecutar<br>
la aplicación. En este caso tendremos dos opciones:</p>
<p><strong>vn springboot:run</strong></p>
<p><strong>mvn springboot:run -Dspring.profiles.active=local</strong></p>
<h3 id="despliegue-a-través-de-docker">Despliegue a través de Docker</h3>
<p>Una vez tengamos las imágenes necesarias para nuestro proyecto, tendremos dos opciones:</p>
<p>La primera consiste en levantar cada servicio de forma individual con los comandos antes mencionados. En este caso, primero deberemos conocer el nombre de nuestra imagen con el comando <strong>docker images</strong> para luego ejecutar el comando <strong>docker run</strong> con las variables necesarias como por ejemplo, los puertos de su ejecución: <strong>docker run -p 8080:8080 gateway</strong>.</p>
<p>La segunda opción, es algo más avanzada, y requiere del uso de una herramienta más compleja llamada Docker-compose. En nuestro caso, esta será la mejor opción, y el archivo Docker-compose de nuestra aplicación tendrá el siguiente aspecto:</p>
<pre class=" language-yml"><code class="prism  language-yml"><span class="token key atrule">version</span><span class="token punctuation">:</span> <span class="token string">'3'</span>
<span class="token key atrule">services</span><span class="token punctuation">:</span>

<span class="token key atrule">postgresdb</span><span class="token punctuation">:</span>
<span class="token key atrule">image</span><span class="token punctuation">:</span> postgres<span class="token punctuation">:</span>latest
<span class="token key atrule">container_name</span><span class="token punctuation">:</span> postgresdb
<span class="token key atrule">volumes</span><span class="token punctuation">:</span>

<span class="token punctuation">-</span> /private/var/lib/postgresql<span class="token punctuation">:</span>/var/lib/postgresql
<span class="token key atrule">environment</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> POSTGRES_PASSWORD=mysecretpassword
<span class="token punctuation">-</span> POSTGRES_USER=postgres
<span class="token punctuation">-</span> POSTGRES_DB=postgres
<span class="token key atrule">ports</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> <span class="token string">"5432:5432"</span>
<span class="token key atrule">expose</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> <span class="token number">5432</span>

<span class="token key atrule">mongodb</span><span class="token punctuation">:</span>
<span class="token key atrule">image</span><span class="token punctuation">:</span> mongo<span class="token punctuation">:</span>latest
<span class="token key atrule">container_name</span><span class="token punctuation">:</span> mongodb

<span class="token key atrule">server-config</span><span class="token punctuation">:</span>
<span class="token key atrule">image</span><span class="token punctuation">:</span> mtribor/taskcontrolapp<span class="token punctuation">-</span>server<span class="token punctuation">-</span>config<span class="token punctuation">:</span>latest
<span class="token key atrule">container_name</span><span class="token punctuation">:</span> server<span class="token punctuation">-</span>config
<span class="token key atrule">ports</span><span class="token punctuation">:</span>

<span class="token punctuation">-</span> <span class="token string">"8888:8888"</span>
<span class="token key atrule">expose</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> <span class="token number">8888</span>

<span class="token key atrule">service-discovery</span><span class="token punctuation">:</span>
<span class="token key atrule">image</span><span class="token punctuation">:</span> mtribor/taskcontrolapp<span class="token punctuation">-</span>service<span class="token punctuation">-</span>discovery<span class="token punctuation">:</span>latest
<span class="token key atrule">container_name</span><span class="token punctuation">:</span> service<span class="token punctuation">-</span>discovery
<span class="token key atrule">ports</span><span class="token punctuation">:</span>

<span class="token punctuation">-</span> <span class="token string">"8761:8761"</span>
<span class="token key atrule">expose</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> <span class="token number">8761</span>
<span class="token key atrule">depends_on</span><span class="token punctuation">:</span>


<span class="token punctuation">-</span> server<span class="token punctuation">-</span>config
<span class="token key atrule">links</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> server<span class="token punctuation">-</span>config
<span class="token key atrule">environment</span><span class="token punctuation">:</span>
<span class="token key atrule">SPRING_CLOUD_CONFIG_URI</span><span class="token punctuation">:</span> <span class="token punctuation">[</span>http<span class="token punctuation">:</span>//server<span class="token punctuation">-</span>config<span class="token punctuation">:</span><span class="token number">8888</span><span class="token punctuation">]</span>(http<span class="token punctuation">:</span>//server<span class="token punctuation">-</span>config<span class="token punctuation">:</span>8888)
<span class="token key atrule">EUREKA_URI</span><span class="token punctuation">:</span> <span class="token punctuation">[</span>http<span class="token punctuation">:</span>//service<span class="token punctuation">-</span>discovery<span class="token punctuation">:</span>8761/eureka<span class="token punctuation">]</span>(http<span class="token punctuation">:</span>//service<span class="token punctuation">-</span>discovery<span class="token punctuation">:</span>8761/eureka)

<span class="token key atrule">task-control-service</span><span class="token punctuation">:</span>
<span class="token key atrule">image</span><span class="token punctuation">:</span> mtribor/task<span class="token punctuation">-</span>control<span class="token punctuation">-</span>service<span class="token punctuation">:</span>latest
<span class="token key atrule">container_name</span><span class="token punctuation">:</span> task<span class="token punctuation">-</span>control<span class="token punctuation">-</span>service<span class="token punctuation">-</span>container
<span class="token key atrule">expose</span><span class="token punctuation">:</span>

<span class="token punctuation">-</span> <span class="token number">8098</span>
<span class="token key atrule">ports</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> <span class="token string">"8098:8098"</span>
<span class="token key atrule">depends_on</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> postgresdb
<span class="token punctuation">-</span> server<span class="token punctuation">-</span>config
<span class="token punctuation">-</span> service<span class="token punctuation">-</span>discovery
<span class="token key atrule">links</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> server<span class="token punctuation">-</span>config
<span class="token punctuation">-</span> service<span class="token punctuation">-</span>discovery
<span class="token key atrule">environment</span><span class="token punctuation">:</span>
<span class="token key atrule">SPRING_CLOUD_CONFIG_URI</span><span class="token punctuation">:</span> <span class="token punctuation">[</span>http<span class="token punctuation">:</span>//server<span class="token punctuation">-</span>config<span class="token punctuation">:</span><span class="token number">8888</span><span class="token punctuation">]</span>(http<span class="token punctuation">:</span>//server<span class="token punctuation">-</span>config<span class="token punctuation">:</span>8888)
<span class="token key atrule">EUREKA_URI</span><span class="token punctuation">:</span> <span class="token punctuation">[</span>http<span class="token punctuation">:</span>//service<span class="token punctuation">-</span>discovery<span class="token punctuation">:</span>8761/eureka<span class="token punctuation">]</span>(http<span class="token punctuation">:</span>//service<span class="token punctuation">-</span>discovery<span class="token punctuation">:</span>8761/eureka)

<span class="token key atrule">task-calendar-service</span><span class="token punctuation">:</span>
<span class="token key atrule">image</span><span class="token punctuation">:</span> mtribor/task<span class="token punctuation">-</span>calendar<span class="token punctuation">-</span>service<span class="token punctuation">:</span>latest
<span class="token key atrule">container_name</span><span class="token punctuation">:</span> task<span class="token punctuation">-</span>calendar<span class="token punctuation">-</span>service<span class="token punctuation">-</span>container
<span class="token key atrule">ports</span><span class="token punctuation">:</span>

<span class="token punctuation">-</span> <span class="token string">"8095:8095"</span>
<span class="token key atrule">expose</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> <span class="token number">8095</span>
<span class="token key atrule">depends_on</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> mongodb
<span class="token punctuation">-</span> server<span class="token punctuation">-</span>config
<span class="token punctuation">-</span> service<span class="token punctuation">-</span>discovery
<span class="token key atrule">links</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> mongodb
<span class="token punctuation">-</span> server<span class="token punctuation">-</span>config
<span class="token punctuation">-</span> service<span class="token punctuation">-</span>discovery
<span class="token key atrule">environment</span><span class="token punctuation">:</span>
<span class="token key atrule">SPRING_DATA_MONGODB_URI</span><span class="token punctuation">:</span> mongodb<span class="token punctuation">:</span>//mongodb/task<span class="token punctuation">-</span>calendar<span class="token punctuation">-</span>
service_db
<span class="token key atrule">SPRING_CLOUD_CONFIG_URI</span><span class="token punctuation">:</span> <span class="token punctuation">[</span>http<span class="token punctuation">:</span>//server<span class="token punctuation">-</span>config<span class="token punctuation">:</span><span class="token number">888</span><span class="token punctuation">]</span>(http<span class="token punctuation">:</span>//server<span class="token punctuation">-</span>config<span class="token punctuation">:</span>888) 8
<span class="token key atrule">EUREKA_URI</span><span class="token punctuation">:</span> <span class="token punctuation">[</span>http<span class="token punctuation">:</span>//service<span class="token punctuation">-</span>discovery<span class="token punctuation">:</span>8761/eureka<span class="token punctuation">]</span>(http<span class="token punctuation">:</span>//service<span class="token punctuation">-</span>discovery<span class="token punctuation">:</span>8761/eureka)

<span class="token key atrule">gateway</span><span class="token punctuation">:</span>



<span class="token key atrule">image</span><span class="token punctuation">:</span> mtribor/taskcontrolapp<span class="token punctuation">-</span>gateway<span class="token punctuation">:</span>latest
<span class="token key atrule">container_name</span><span class="token punctuation">:</span> gateway
<span class="token key atrule">ports</span><span class="token punctuation">:</span>

<span class="token punctuation">-</span> <span class="token string">"8080:8080"</span>
<span class="token key atrule">depends_on</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> server<span class="token punctuation">-</span>config
<span class="token punctuation">-</span> service<span class="token punctuation">-</span>discovery
<span class="token key atrule">links</span><span class="token punctuation">:</span>
<span class="token punctuation">-</span> server<span class="token punctuation">-</span>config
<span class="token punctuation">-</span> service<span class="token punctuation">-</span>discovery
<span class="token key atrule">environment</span><span class="token punctuation">:</span>
<span class="token key atrule">SPRING_CLOUD_CONFIG_URI</span><span class="token punctuation">:</span> <span class="token punctuation">[</span>http<span class="token punctuation">:</span>//server<span class="token punctuation">-</span>config<span class="token punctuation">:</span><span class="token number">8888</span><span class="token punctuation">]</span>(http<span class="token punctuation">:</span>//server<span class="token punctuation">-</span>config<span class="token punctuation">:</span>8888)
<span class="token key atrule">EUREKA_URI</span><span class="token punctuation">:</span> <span class="token punctuation">[</span>http<span class="token punctuation">:</span>//service<span class="token punctuation">-</span>discovery<span class="token punctuation">:</span>8761/eureka<span class="token punctuation">]</span>(http<span class="token punctuation">:</span>//service<span class="token punctuation">-</span>discovery<span class="token punctuation">:</span>8761/eureka)
</code></pre>
<p>Para la ejecución de la aplicación a través de este método, será necesario navegar, a través de la consola de comandos, hasta la carpeta o directorio donde se encuentre dicho archivo y, una vez allí, deberemos ejecutar el comando docker-compose up.</p>
<h2 id="conclusión">Conclusión</h2>
<p>Desde el comienzo de esta investigación, como alumno, he sabido que se trataba de un proyecto muy ambicioso ya que, más que centrado en el desarrollo, se trata de un tema de investigación centrado en la capa más alta del diseño software: la arquitectura.</p>
<p>Esto, sin duda me ha ayudado a crecer como desarrollador, ya que ha sido un salto inmenso respecto a las enseñanzas aportadas en el centro educativo debido a la necesidad de entender una serie de tecnologías y conceptos tan actuales, que en algunos casos sus definiciones son etéreas y poco accesibles.</p>
<p>Como conclusión personal, quizás este sea el mejor resumen:</p>
<p><em>&lt;&lt; Parecía demasiado para mí, pero no ha sido para tanto. Dividir y abstraer no son conceptos nuevos y los microservicios lo saben y lo han utilizado a su favor para construirse alrededor de la nube. En definitiva, con este proyecto, he crecido como desarrollador.&gt;&gt;</em></p>
<p>Respecto a las conclusiones de la investigación, centradas en la tecnología, posiblemente estas sean las mayores ventajas por las que me atrevería a decir que este patrón de arquitectura es recomendable:</p>
<ul>
<li>
<p>Integrar y escalar con aplicaciones de terceros es muy sencillo</p>
</li>
<li>
<p>Un proyecto modular basado en microservicios evoluciona de forma más natural, es una forma fácil de gestionar diferentes desarrollos, utilizando los recursos disponibles, al mismo tiempo.</p>
</li>
<li>
<p>Los microservicios pueden desplegarse según sea necesario, por lo que funcionan bien dentro de metodologías ágiles.</p>
</li>
<li>
<p>El mantenimiento es más simple y barato — con los microservicios se puede hacer mejoras de un módulo a la vez, dejando que el resto funcione normalmente.</p>
</li>
<li>
<p>Las soluciones desarrolladas con arquitectura de microservicio permiten la mejora rápida y continua de cada funcionalidad.</p>
</li>
<li>
<p>Versátil — los microservicios permiten el uso de diferentes tecnologías y lenguajes.</p>
</li>
<li>
<p>El desarrollador puede aprovechar las funcionalidades que ya han sido desarrolladas por<br>
terceros — no necesita reinventar la rueda, simplemente utilizar lo que ya existe y funciona.</p>
</li>
</ul>
<p>Con estas premisas, los microservicios son una arquitectura que sin duda tienen mucho sentido hoy día, donde la tecnología está cada vez más descentralizada y la mayor parte de las aplicaciones requieren del manejo de grandes datos y soportar grandes cargas de trabajo.</p>
<p>Y por suerte, para eso está la nube. La nube nos ofrece esa escalabilidad que las aplicaciones necesitan, y esa conectividad con el mundo que los usuarios necesitamos, pero no todo es tan bonito.</p>
<p>Las aplicaciones monolíticas no son capaces de sacarle todo el partido a las tecnologías cloud, ya que usualmente estamos acostumbrados a trabajar con servidores estáticos, con direcciones fijas donde se alojan nuestras aplicaciones.</p>
<p>Pero para eso están los microservicios, para definir una nueva arquitectura de comunicación que nos permita unificar todos esos servicios deslocalizados a través de unos protocolos de red que transmitan los datos y, mientras, la nube que haga el resto con eso de equilibrar las cargas y flexibilidad las capacidades de nuestros servidores.</p>
<p>Por otro lado, también existen contras, y son los siguientes:</p>
<ul>
<li>
<p>Debido a que los componentes están distribuidos, las pruebas globales son más complicadas.</p>
</li>
<li>
<p>Es necesario controlar el número de microservicios que se gestionan, ya que cuantos más microservicios existan en una solución, más difícil será gestionarlos e integrarlos.</p>
</li>
<li>
<p>Los microservicios requieren desarrolladores experimentados con un nivel muy alto de experiencia.</p>
</li>
<li>
<p>Se requiere un control exhaustivo de la versión.</p>
</li>
<li>
<p>La arquitectura de microservicios puede ser costosa de implementar debido a los costos de licenciamiento de aplicaciones de terceros.</p>
</li>
</ul>
<h2 id="repositorio-github">Repositorio GitHub</h2>
<h3 id="httpsgithub.commtribordam_pfg_microservicios"><a href="https://github.com/MTribor/DAM_PFG_Microservicios">https://github.com/MTribor/DAM_PFG_Microservicios</a></h3>
<h2 id="bibliografía">Bibliografía</h2>
<h3 id="microservicios-1">Microservicios</h3>
<p>Tutorial sobre Microservicios con ejemplo → <a href="https://www.guru99.com/microservices-tutorial.html">https://www.guru99.com/microservices-tutorial.html</a></p>
<p>Ejemplo de aplicación de una tienda hecha con arquitectura en microservicios y distintas tecnologías para<br>
cada microservicio - Instana Robot Shop → <a href="https://github.com/instana/robot-shop/">https://github.com/instana/robot-shop/</a> || Guía para esta<br>
aplicación → <a href="https://dzone.com/articles/stans-robot-shop-a-sample-microservice-application">https://dzone.com/articles/stans-robot-shop-a-sample-microservice-application</a></p>
<p>Ejemplo de aplicación de tienda online basada en microservicios - Maltorpro Microservice Shop Demo →<br>
<a href="https://github.com/maltorpro/microservice-shop-demo">https://github.com/maltorpro/microservice-shop-demo</a></p>
<p>Ejemplo sencillo de tienda online con dos microservicios - IBM →<br>
<a href="https://www.ibm.com/blogs/bluemix/2015/03/sample-application-using-microservices-bluemix/?s_tact=C43401LW">https://www.ibm.com/blogs/bluemix/2015/03/sample-application-using-microservices-bluemix/?s_tact=C43401LW</a></p>
<p>Ejemplo de tienda online con API documentada y todo tipo de documentos de ayuda - Weaveworks SockShop → <a href="https://microservices-demo.github.io/">https://microservices-demo.github.io/</a></p>
<p>Artículo sobre la arquitectura de Microservicios - → <a href="https://microservices.io/patterns/microservices.html">https://microservices.io/patterns/microservices.html</a></p>
<p>Guía sencilla para crear microservicios - DZone→ <a href="https://dzone.com/articles/quick-guide-to-microservices-with-spring-boot-20-e">https://dzone.com/articles/quick-guide-to-microservices-with-spring-boot-20-e</a> <a href="https://dzone.com/articles/quick-guide-to-microservices-with-spring-boot-20-e">https://dzone.com/articles/quick-guide-to-microservices-with-spring-boot-20-e</a></p>
<p>¿Por qué usar arquitectura de Microservicios? Utilizando un API Gateway- Microsoft →<br>
<a href="https://docs.microsoft.com/es-es/dotnet/standard/microservices-architecture/architect-microservice-container-applications/direct-client-to-microservice-communication-versus-the-api-gateway-pattern">https://docs.microsoft.com/es-es/dotnet/standard/microservices-architecture/architect-microservice-container-applications/direct-client-to-microservice-communication-versus-the-api-gateway-pattern</a></p>
<hr>
<h3 id="spring-cloud">Spring Cloud</h3>
<h4 id="gateway">Gateway</h4>
<p>Mini-guía de Spring Cloud Gateway - Bi Geek → <a href="https://blog.bi-geek.com/arquitecturas-microservicios-spring-cloud-gateway/">https://blog.bi-geek.com/arquitecturas-microservicios-spring-cloud-gateway/</a></p>
<p>¿Por qué usar arquitectura de Microservicios? Utilizando un API Gateway- Microsoft →<br>
<a href="https://docs.microsoft.com/es-es/dotnet/standard/microservices-architecture/architect-microservice-container-applications/direct-client-to-microservice-communication-versus-the-api-gateway-pattern">https://docs.microsoft.com/es-es/dotnet/standard/microservices-architecture/architect-microservice-container-applications/direct-client-to-microservice-communication-versus-the-api-gateway-pattern</a></p>
<h4 id="service-discovery-2">Service Discovery</h4>
<p>Documentación Spring Service Discovery Netflix - web oficial → <a href="https://cloud.spring.io/spring-cloud-netflix/multi/multi__service_discovery_eureka_clients.html">https://cloud.spring.io/spring-cloud-netflix/multi/multi__service_discovery_eureka_clients.html</a></p>
<h4 id="config-server">Config Server</h4>
<p>Spring cloud config client retry → <a href="https://cloud.spring.io/spring-cloud-config/1.4.x/multi/multi__spring_cloud_config_client.html">https://cloud.spring.io/spring-cloud-config/1.4.x/multi/multi__spring_cloud_config_client.html</a></p>
<p>Spring cloud retry guide → <a href="https://www.alessiofiore.com/blog/programming/j2ee/spring/1654/how-to-retry-on-spring-config-server-connection-failure/">https://www.alessiofiore.com/blog/programming/j2ee/spring/1654/how-to-retry-on-spring-config-server-connection-failure/</a></p>
<hr>
<h3 id="spring-boot-1">Spring Boot</h3>
<p>Variables de entorno Spring - StackOverflow → <a href="https://stackoverflow.com/questions/47580247/optional-environment-variables-in-spring-app">https://stackoverflow.com/questions/47580247/optional-environment-variables-in-spring-app</a></p>
<p>Construir una API REST con Spring y Java → <a href="https://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration">https://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration</a></p>
<p>Tutoriales RESTFul con Spring → <a href="https://www.baeldung.com/rest-with-spring-series">https://www.baeldung.com/rest-with-spring-series</a></p>
<hr>
<h3 id="spring-data">Spring Data</h3>
<h4 id="mongodb">MongoDB</h4>
<p>Implementación de un repositorio personalizado → <a href="https://stackoverflow.com/questions/50185775/can-we-use-both-mongorepository-and-mongotemplate-in-same-application">https://stackoverflow.com/questions/50185775/can-we-use-both-mongorepository-and-mongotemplate-in-same-application</a> ||<br>
<a href="https://blog.marcnuri.com/spring-data-mongodb-implementacion-de-un-repositorio-a-medida/">https://blog.marcnuri.com/spring-data-mongodb-implementacion-de-un-repositorio-a-medida/</a> ||</p>
<p><a href="https://stackoverflow.com/questions/17008947/whats-the-difference-between-spring-datas-mongotemplate-and-mongorepository">https://stackoverflow.com/questions/17008947/whats-the-difference-between-spring-datas-mongotemplate-and-mongorepository</a></p>
<h4 id="postgresql">PostgreSQL</h4>
<p>Spring data y PostgreSQL → <a href="https://dzone.com/articles/spring-boot-and-postgresql">https://dzone.com/articles/spring-boot-and-postgresql</a></p>
<p>Persistencia con Spring Data y PostgreSQL → <a href="http://codedpoetry.com/persistence-with-spring-data-">http://codedpoetry.com/persistence-with-spring-data-</a><br>
postgresql/</p>
<hr>
<h3 id="docker">Docker</h3>
<p>Documentación Fabric8 (maven plugin): <a href="https://maven.fabric8.io/">https://maven.fabric8.io/</a> - <a href="https://dmp.fabric8.io/#simple-">https://dmp.fabric8.io/#simple-</a><br>
dockerfile-build - <a href="https://fabric8.io/guide/mavenDockerBuild.html">https://fabric8.io/guide/mavenDockerBuild.html</a> - <a href="https://github.com/fabric8io/docker-maven-plugin/blob/master/doc/intro.md">https://github.com/fabric8io/docker-maven-plugin/blob/master/doc/intro.md</a></p>
<p>Crear un DockerFile → <a href="https://docs.docker.com/get-started/part2/">https://docs.docker.com/get-started/part2/</a></p>
<p>Crear un DockerFile para Spring Boot → <a href="https://spring.io/guides/gs/spring-boot-docker/">https://spring.io/guides/gs/spring-boot-docker/</a> - <a href="https://spring.io/guides/topicals/spring-boot-docker">https://spring.io/guides/topicals/spring-boot-docker</a></p>
<p>Comandos para Docker → <a href="https://medium.com/the-code-review/top-10-docker-commands-you-cant-live-without-54fb6377f481">https://medium.com/the-code-review/top-10-docker-commands-you-cant-live-without-54fb6377f481</a> - <a href="https://coderwall.com/p/ewk0mq/stop-remove-all-docker-containers">https://coderwall.com/p/ewk0mq/stop-remove-all-docker-containers</a> -<br>
<a href="https://linuxize.com/post/how-to-remove-docker-images-containers-volumes-and-networks/">https://linuxize.com/post/how-to-remove-docker-images-containers-volumes-and-networks/</a></p>
<p>Durante la investigación de este proyecto se redactó un artículo referente a fabric8 por los alumnos Marco Borreguero y Alberto Serrano → <a href="https://profile.es/blog/fabric8-gestion-imagenes-y-contenedores-docker-desde-maven/">https://profile.es/blog/fabric8-gestion-imagenes-y-contenedores-docker-desde-maven/</a></p>

