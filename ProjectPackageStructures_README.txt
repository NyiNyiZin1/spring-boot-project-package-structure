All Backend Service Projects Must Include Following Packages

- configurations  	// Contains project configurations files. E.g Spring Config
- handlers		// For Event Handlers (DB, controller, system, etc..)
- controllers		// For Every Classes must be Annotated with @RestController
- services		// For Every Services Annotated with @Service. Database Services Should also Be Annotated Extra with @Transactional
- repositories		// For Repository Classes with @Repository. @RepositoryRestResource if you intent to expose this repo as REST
- utilities		// For Utility components such as calculations/ tempory storage etc. Must be annotated with @Component
- entities		// For DOM classes which represent database entities. @Entity annotation required.
- dtos/dtms		// Data Transfer Objects/Models that will be transferred between services.


Front End Projects Must Be Structured in following packages

- models		// Model classes for communication between server and client
- components		// View Controller components either in separate files or combined in folders. Activities/Fragments/ViewModels/ViewAdapters for android. HTML, CSS, TS for Angular
- services		// Services connecting to Authorization server or API servers and exchanging data
- utilities		// Utility classes



