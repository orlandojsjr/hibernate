# hibernate

 Fazer uma webapp que grave os seguintes dados

o   Entidades: Pessoas 1:N Endereços

o   Analisar o tipo da classe injetada no set/list pelo hibernate

o   Tomar propositalmente lazy initialization e testar diferentes estratégias de loading (eager, subselect, etc)

o   Já configurem, e desconfigurem, o open session in view.

·         Bora implementar uma classe de collection nossa (MyFakeHibernateList) que por default não sabe dizer seu size ou os elementos.

o   Quando o size ou get(x) for chamado ele deve dar um print "Eu sou um proxy e iria carregar os elementos agora".

o   Olhar as bibilitecas CGlib e javassist e analisar os usos/diferenças

·         Estudar, e talvez configurar:

o   Caches de primeiro e segundo nível

o   Associações polimórficas

o   Batch size

o   Locks otimistas e pessimistas

o   Stateless session
