// main.js
// a.js 와 b.js import 해서 구성요소를 사용하자.

// import {fun} from './a.js';
// import {fun2, Person} from './b.js';
// import fun3 from './c.js';

import {fun as xxx } from './a.js';
import {fun2, Person} from './b.js';
import {default as yyy} from './c.js';

xxx();
fun2();
yyy();
var p = new Person();