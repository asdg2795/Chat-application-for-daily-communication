# 📝 프로젝트 개요
- 프로젝트명 : 모두를 위한 채팅 애플리케이션<br>
- 목적 : 간단하고 직관적인 채팅 앱 구현, 실시간 메시지 송수신 및 알림 기능 제공<br>
- 목표 사용자 : 일반 사용자, 커뮤니티 및 그룹 활동 사용자<br>

# 👥 팀 소개
| Frontend | Backend | Backend | Backend |
|----------|----------|----------|----------|
| <img src="https://github.com/user-attachments/assets/4a33a8f1-047d-4e82-bfb5-2d163a7a51f6" width="150" height="150"> | <img src="https://github.com/user-attachments/assets/602eb538-0f9b-4f80-9f39-478ac2be37eb" width="150" height="150"> | <img src="https://via.placeholder.com/150" width="150" height="150"> | <img src="https://via.placeholder.com/150" width="150" height="150"> |
| **이강호** | **김준수** | **강대희** | **엄수경** |

# 아키텍처
![image](https://github.com/user-attachments/assets/26b84f94-aa7f-4bdc-a51e-a1c7684e6712)

# 주요 기능
### ✔️ 실시간 채팅
 - WebSocket 기반 실시간 통신
 - 1:1 및 그룹 채팅 지원
 - 이모지/파일 전송 기능
### ✔️메시지 관리
 - IndexedDB를 이용한 메시지 캐싱
 - 최대 100개 메시지 자동 저장
 - 채팅 기록 조회 기능
### ✔️사용자 관리
 - JWT 기반 인증 시스템
 - 친구 목록 관리
 - 프로필 관리 기능
### ✔️채팅방 관리
 - 동적 채팅방 생성/참여 시스템
 - 참여자 목록 확인
 - 채팅방 검색 기능

# 기술 스택
**Front-End**<br>
![vite](https://img.shields.io/badge/vite-646CFF.svg?&style=for-the-badge&logo=vite&logoColor=white)
![storybook](https://img.shields.io/badge/storybook-FF4785.svg?&style=for-the-badge&logo=storybook&logoColor=white)
![Zustand](https://img.shields.io/badge/Zustand-2A3FFB.svg?&style=for-the-badge&logo=Zustand&logoColor=white)
![tailwindcss](https://img.shields.io/badge/tailwindcss-06B6D4.svg?&style=for-the-badge&logo=tailwindcss&logoColor=white)

**Back-End**<br>
![Java](https://img.shields.io/badge/Java-007396.svg?&style=for-the-badge&logo=Java&logoColor=white)
![SpringBoot](https://img.shields.io/badge/SpringBoot-6DB33F.svg?&style=for-the-badge&logo=SpringBoot&logoColor=white)
![springsecurity](https://img.shields.io/badge/springsecurity-6DB33F.svg?&style=for-the-badge&logo=springsecurity&logoColor=white)
![springdatajpa](https://img.shields.io/badge/springdatajpa-5865F2.svg?&style=for-the-badge&logo=springdatajpa&logoColor=white)

**Database**<br>
![MySQL](https://img.shields.io/badge/MySQL-4479A1.svg?&style=for-the-badge&logo=MySQL&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-47A248.svg?&style=for-the-badge&logo=MongoDB&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-FF4438.svg?&style=for-the-badge&logo=Redis&logoColor=white)

**Cloud-Service**<br>
![amazons3](https://img.shields.io/badge/amazons3-569A31.svg?&style=for-the-badge&logo=amazons3&logoColor=white)
![awslambda](https://img.shields.io/badge/awslambda-FF9900.svg?&style=for-the-badge&logo=awslambda&logoColor=white)

**Deploy&CI/CD**<br>
![docker](https://img.shields.io/badge/docker-2496ED.svg?&style=for-the-badge&logo=docker&logoColor=white)
![nginx](https://img.shields.io/badge/nginx-009639.svg?&style=for-the-badge&logo=nginx&logoColor=white)
![gitlabrunner](https://img.shields.io/badge/gitlabrunner-B8DBE4.svg?&style=for-the-badge&logo=gitlabrunner&logoColor=white)

# 커밋 컨벤션
- **feature(feat)**: 새로운 기능 추가
- **refactor**: 코드 리팩토링
- **fix**: 버그 수정
- **docs**: 문서 수정
- **test**: 테스트 코드 관련
- **config**: 프로젝트 세팅/빌드/패키지 매니저
- **chore**: 기타 수정 사항
- **init**: 프로젝트 초기 설정

# 플로우차트
![image](https://github.com/user-attachments/assets/cbe38d13-d51a-4f76-91d8-97008ac54d00)

# 피그마
![image](https://github.com/user-attachments/assets/6227d7ac-e7a2-456c-9bd3-b7d0084536ac)

# API 명세서
https://docs.google.com/spreadsheets/d/1G8_AqPqJMMwJgapfmnYmdf429MRi7Tmjv939TC2c8MU/edit?pli=1&gid=0#gid=0

# ERD
![image](https://github.com/user-attachments/assets/5084ea10-4939-47fd-a1c5-21aa5ea53a4a)

# 트러블 슈팅
- [순환참조 문제](https://velog.io/@mangez_js/Trouble-Shooting-%EC%88%9C%ED%99%98-%EC%B0%B8%EC%A1%B0-%EB%AC%B8%EC%A0%9C)
- [MongoDB 저장 시 UTC 저장 문제](https://velog.io/@mangez_js/Trouble-Shooting-MongoDB-%EC%A0%80%EC%9E%A5-%EC%8B%9C-%EA%B7%B8%EB%A6%AC%EB%8B%88%EC%B9%98-%ED%91%9C%EC%A4%80%EC%8B%9C%EB%A1%9C-%EC%A0%80%EC%9E%A5%EB%90%98%EB%8A%94-%EC%9D%B4%EC%9C%A0)
- [웹소켓에서 채팅 읽음 기능을 처리해야 하는데, 읽음 처리가 아닌 전송 로직이 실행](https://velog.io/@mangez_js/Trouble-Shooting-%EC%9B%B9%EC%86%8C%EC%BC%93%EC%97%90%EC%84%9C-%EC%B1%84%ED%8C%85-%EC%9D%BD%EC%9D%8C-%EA%B8%B0%EB%8A%A5%EC%9D%84-%EC%B2%98%EB%A6%AC%ED%95%B4%EC%95%BC-%ED%95%98%EB%8A%94%EB%8D%B0-%EC%9D%BD%EC%9D%8C-%EC%B2%98%EB%A6%AC%EA%B0%80-%EC%95%84%EB%8B%8C-%EC%A0%84%EC%86%A1-%EB%A1%9C%EC%A7%81%EC%9D%B4-%EC%8B%A4%ED%96%89)

