# ![dream](./frontend/src/assets/img/Modified_logo.svg) 함께, 드림
## Contents
 1. [개요](#1-개요) <br>2. [프로젝트 소개](#2-프로젝트-소개) <br> 3. [주요기능](#3-주요기능)
4. [기술스택](#4-기술스택)
   - [Front-End](#41-front-end)
   - [Back-End](#42-back-end)
5. [프로젝트 구조도](#5-프로젝트-구조도)
6. [아키텍쳐](#6-아키텍쳐)
7. [팀원](#7-팀원)

## 1. 개요 

:heavy_check_mark: 개발기간 : 2023.08.21 ~ 2023.10.06 <br>
:heavy_check_mark: 삼성 청년 소프트웨어 아카데미(SSAFY) 핀테크 프로젝트 <br>
:heavy_check_mark: 요구사항 분석: 광주자립전담기관 김평화 과장님 면담 & 자립청년들과의 이메일 & 화상 인터뷰 진행 <br>
:heavy_check_mark: 기획 배경: <br>




## 2. 프로젝트 소개

# <img src="https://github.com/Team-MukJa/MukJa/assets/46624130/2c7f753a-2937-4f67-b2a8-eaf7e029a2b5" alt="함께, 드림 메인" width="170" height="340"> ![ezgif com-video-to-gif](https://github.com/Team-MukJa/MukJa/assets/46624130/1ce54858-63a1-4e64-87ba-9175bff5353b)


## 3. 주요기능

## 4. 기술스택

### 4.1 Front-End 🌈

<img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black"><img src="https://img.shields.io/badge/Redux-764ABC?style=for-the-badge&logo=Redux&logoColor=black"><img src="https://img.shields.io/badge/Pwa-5A0FC8?style=for-the-badge&logo=PWA&logoColor=black"><img src="https://img.shields.io/badge/styledcomponents-db7093?style=for-the-badge&logo=styledcomponents&logoColor=black">

### 4.2 Back-End 📑

<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=black"><img src="https://img.shields.io/badge/mysql-4479a1?style=for-the-badge&logo=mysql&logoColor=black"><img src="https://img.shields.io/badge/logstash-005571?style=for-the-badge&logo=logstash&logoColor=black"><img src="https://img.shields.io/badge/elasticsearch-005571?style=for-the-badge&logo=elasticsearch&logoColor=black"><img src="https://img.shields.io/badge/kibana-005571?style=for-the-badge&logo=kibana&logoColor=black">

### 4.3 Infra 🏠

<img src="https://img.shields.io/badge/amazon aws-232f3e?style=for-the-badge&logo=amazon aws&logoColor=black"><img src="https://img.shields.io/badge/docker-2496ed?style=for-the-badge&logo=docker&logoColor=black"><img src="https://img.shields.io/badge/jenkins-d24939?style=for-the-badge&logo=jenkins&logoColor=black"><img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=black">

## 5. 프로젝트 구조도
![Intro](./frontend/src/assets/img/Intro_picture.svg)

```plaintext
📦frontend
 ┣ 📂build
 ┃ ┣ 📂static
 ┃ ┃ ┣ 📂css
 ┃ ┃ ┣ 📂js
 ┃ ┃ ┗ 📂media
 ┣ 📂public
 ┣ 📂src
 ┃ ┣ 📂api
 ┃ ┣ 📂assets
 ┃ ┃ ┣ 📂data
 ┃ ┃ ┣ 📂fonts
 ┃ ┃ ┗ 📂img
 ┃ ┣ 📂components
 ┃ ┃ ┣ 📂button
 ┃ ┃ ┣ 📂card
 ┃ ┃ ┣ 📂dropdown
 ┃ ┃ ┣ 📂header
 ┃ ┃ ┣ 📂input
 ┃ ┃ ┣ 📂loading
 ┃ ┃ ┣ 📂Logo
 ┃ ┃ ┣ 📂modal
 ┃ ┃ ┣ 📂mydata
 ┃ ┃ ┗ 📂Nav
 ┃ ┣ 📂router
 ┃ ┣ 📂store
 ┃ ┣ 📂style
 ┃ ┣ 📂views
 ┃ ┣ 📜App.css
 ┃ ┣ 📜App.js
 ┃ ┣ 📜index.css
 ┃ ┣ 📜index.js
 ┃ ┣ 📜service-worker.js
 ┃ ┗ 📜serviceWorkerRegistration.js
```

```
📦backend
 ┣ 📂.gradle
 ┃ ┣ 📂8.2.1
 ┃ ┃ ┣ 📂checksums
 ┃ ┃ ┃ ┣ 📜checksums.lock
 ┃ ┃ ┃ ┣ 📜md5-checksums.bin
 ┃ ┃ ┃ ┗ 📜sha1-checksums.bin
 ┃ ┃ ┣ 📂dependencies-accessors
 ┃ ┃ ┃ ┣ 📜dependencies-accessors.lock
 ┃ ┃ ┃ ┗ 📜gc.properties
 ┃ ┃ ┣ 📂executionHistory
 ┃ ┃ ┃ ┣ 📜executionHistory.bin
 ┃ ┃ ┃ ┗ 📜executionHistory.lock
 ┃ ┃ ┣ 📂fileChanges
 ┃ ┃ ┃ ┗ 📜last-build.bin
 ┃ ┃ ┣ 📂fileHashes
 ┃ ┃ ┃ ┣ 📜fileHashes.bin
 ┃ ┃ ┃ ┣ 📜fileHashes.lock
 ┃ ┃ ┃ ┗ 📜resourceHashesCache.bin
 ┃ ┃ ┗ 📜gc.properties
 ┃ ┣ 📂buildOutputCleanup
 ┃ ┃ ┣ 📜buildOutputCleanup.lock
 ┃ ┃ ┣ 📜cache.properties
 ┃ ┃ ┗ 📜outputFiles.bin
 ┃ ┣ 📂vcs-1
 ┃ ┃ ┗ 📜gc.properties
 ┃ ┗ 📜file-system.probe
 ┣ 📂.idea
 ┃ ┣ 📜.gitignore
 ┃ ┣ 📜compiler.xml
 ┃ ┣ 📜gradle.xml
 ┃ ┣ 📜jarRepositories.xml
 ┃ ┣ 📜misc.xml
 ┃ ┣ 📜uiDesigner.xml
 ┃ ┗ 📜vcs.xml
 ┣ 📂build
 ┃ ┣ 📂classes
 ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┗ 📂main
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂youth
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂dream
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DreamApplication.class
 ┃ ┣ 📂resources
 ┃ ┃ ┗ 📂main
 ┃ ┃ ┃ ┗ 📜application.properties
 ┃ ┗ 📂tmp
 ┃ ┃ ┗ 📂compileJava
 ┃ ┃ ┃ ┗ 📜previous-compilation-data.bin
 ┣ 📂dream
 ┃ ┣ 📂gradle
 ┃ ┃ ┗ 📂wrapper
 ┃ ┃ ┃ ┣ 📜gradle-wrapper.jar
 ┃ ┃ ┃ ┗ 📜gradle-wrapper.properties
 ┃ ┣ 📂src
 ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂youth
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂dream
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂account
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜accountController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂benefit
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜benefitController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂transaction
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜transactionController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜userController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂welfare
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜welfareController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂account
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜accountRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Account.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂benefit
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜benefitRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Benefit.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂transaction
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜transactionRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Transaction.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜userRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜User.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂welfare
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜welfareRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Welfare.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂account
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜accountDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜accountService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂benefit
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜benefitDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜benefitService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂transaction
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜transactionDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜transactionService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜userDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜userService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂welfare
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜welfareDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜welfareService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DreamApplication.java
 ┃ ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┃ ┗ 📜application.yml
 ┃ ┃ ┗ 📂test
 ┃ ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂youth
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂dream
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DreamApplicationTests.java
 ┃ ┣ 📜.gitignore
 ┃ ┣ 📜build.gradle
 ┃ ┣ 📜gradlew
 ┃ ┣ 📜gradlew.bat
 ┃ ┗ 📜settings.gradle
 ┗ 📜HELP.md
```

## 6. 아키텍쳐

![architecture](./frontend/src/assets/img/architecture.png)

## 7. 팀원

|[<img src = "https://avatars.githubusercontent.com/u/101040824?v=4" width=100>](https://github.com/1212Hong)|[<img src = "https://avatars.githubusercontent.com/u/46624130?v=4" width = 100>](https://github.com/soo0300)| [<img src = "https://avatars.githubusercontent.com/u/82308415?v=4" width = 100>](https://github.com/https://github.com/byunyc0124)  | [<img src = "https://avatars.githubusercontent.com/u/107923409?v=4" width =100>](https://github.com/SeungJun) |
|:---:|------------------|---|:-------------------------------------------------------------------------------------------------------------:|
| 김대홍 |김수진|변영채|홍승준|
