# 백준 알고리즘 연습 프로젝트

## Dev Log

### 2026-02-10
기존 Eclipse 기반 백준 레포를 macOS(IntelliJ) 환경으로 가져오면서, IDE/빌드 산출물은 Git에서 제외하고 소스만 관리하도록 정리함.

- 작업 내용
  1) 레포 루트에 `.gitignore` 생성 (Eclipse/IntelliJ 설정 + 빌드 산출물 무시)
  2) 기존에 Git이 추적하던 Eclipse 설정 및 `bin/` 산출물은 `git rm --cached`로 추적 해제
  3) 커밋 & 푸시 완료 (`working tree clean` 확인)
  > Note: `bin/`, `.settings/`, `.idea/` 등은 로컬에서 생성될 수 있지만 Git에는 포함되지 않습니다.
