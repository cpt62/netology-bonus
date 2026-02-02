# Курс по PostgreSQL

Учебный репозиторий для прохождения модулей по PostgreSQL.

## Как запустить

1. Установите Docker и docker-compose.
2. Склонируйте репозиторий.
3. Выполните:
   \`\`\`bash
   cp .env.example .env          # настройте пароль (опционально)
   docker-compose up -d          # запустить БД
   \`\`\`
4. Подключайтесь к БД:
   - Host: \`localhost\`
   - Port: \`5432\`
   - DB: \`study_db\`
   - User: \`postgres\`
   - Password: \`111\` (или из .env)

## Остановить
\`\`\`bash
docker-compose down
\`\`\`
EOF