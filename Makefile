.PHONY: setup
setup:
	@docker-compose up -d --build

.PHONY: teardown
teardown:
	@docker-compose down