/*
 * Singleton:   применён в классе InputProcessor, так как нам необходим лишь 1 экземпляр и нужна лишь 1 точка входа
 * Factory:     применён в классе InputProcessor для создания объекта класса Person (создан PersonFactory)
 * Builder:     применён в классе Person для заполнения только нужных полей
 * Adapter:     не применён - не пригодилось
 * Bridge:      применён в классе Hair вместо наследования логично использовать композицию
 * Facade:      применён в классе AppearanceGenerator.java для генерации параметров
 * DTO:         применён в классе FioGenerator.java (name вместо lastName, firstName, midName),
 *  чтобы сократить количество методов и шагов для заполнения ФИО
 * Шаблон:      не применён - потому что мы отказались от наследования в пользу композиции
 */