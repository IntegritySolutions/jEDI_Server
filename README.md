# jEDI_Server
## Basic Description
Server side application for parsing incoming and sending outgoing  EDI files.

## Overview
jEDI_Server parses out incoming EDI files, placing the data into a MySQL Database Server. This is a two-step process in that the data is placed into the appropriate data tables, as well as into audit tables to maintain a history of EDI transmissions. By maintaining this audit trail, Integrity Solutions is protecting their clients from bad claims by their customers. The audit data allows the recieving company to search for EDI transmissions in the event of a claim by a customer that they sent in an order, for example, but have never recieved the purchase. The recieving company can then search their EDI audit tables for the order their customer claims to have transmitted. These audit records will allow claims to be settled in a quick manner and the appropriate actions taken to correct the situation.

Integrity Solutions was originally attempting to incorporate this functionality into the jEDI Master application, but has since decided that this should be a separate, stand-alone application that should only be installed and run on a backoffice server system. In this way, there will be a single entry point for all EDI transmissions and protect the database from any kind of corruption or collisions when inserting the data into the tables, production and audit. Therefore, Integrity Solutions has created this new repository for the code for the server-side EDI parsing utility.

## Contributing
If anyone would like to contribute to this project, Integrity Solutions can always use:
* Programmers: Java/J2SE
* Technical Writers: JavaHelp functionality
* Translators: Any languages are welcome
* Design Engineers: To help us plan out the functionality of the system
* Graphic Artists: To create icons/PNG graphics for use throughout the application.
* Testers: To help us find bugs and feature failures in the software.

If you would like to contribute in any of these functions, please shoot us an email at PekinSOFT@outlook.com. We look forward to working with you on this project!
